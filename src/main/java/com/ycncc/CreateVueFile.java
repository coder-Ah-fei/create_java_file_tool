package com.ycncc;

import com.ycncc.common.enums.FileType;
import com.ycncc.factory.FileFactory;
import jakarta.persistence.Column;
import org.springframework.core.annotation.AnnotationUtils;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateVueFile {

    public static void main(String[] args) throws Exception {
        File file1 = new File("/Users/yang/work/workspace/smartPropety/common/target/common-0.0.1-SNAPSHOT.jar");
        File file2 = new File("/Users/yang/work/workspace/smartPropety/dao/target/dao-0.0.1-SNAPSHOT.jar");
        System.out.println(new File(".").getAbsolutePath());
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{file1.toURI().toURL(), file2.toURI().toURL()});


        File file = new File("/Users/yang/work/workspace/smartPropety/dao/src/main/java/com/ycncc/smartproperty/entity");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {


            String name = files[i].getName();
            String[] split = name.split(".java");
            String fileName = split[0];
            if (fileName.equals("basic")) {
                continue;
            }

            Class<?> clazz = urlClassLoader.loadClass("com.ycncc.smartproperty.entity." + fileName);

            Field[] declaredFields = clazz.getDeclaredFields();
            List<Map<String, String>> list = new ArrayList<>();
            for (Field field : declaredFields) {
                if (field.getName().equals("serialVersionUID")) {
                    continue;
                }
                if (field.getName().equals("id")) {
                    continue;
                }
                Map<String, String> map = new HashMap<>();
                map.put("name", field.getName());
                list.add(map);
//                Column annotation = field.getAnnotation(Column.class);

                Column annotation = AnnotationUtils.findAnnotation(field, Column.class);
                if (annotation != null) {
                    String s1 = annotation.columnDefinition();
                    String substring = s1.substring(s1.indexOf("'") + 1, s1.lastIndexOf("'"));
                    map.put(field.getName(), substring);
                    System.out.println(substring);

                }
            }

//            createFile(fileName, FileType.vue_add, list, "/Users/yang/work/workspace/create_java_file_tool/src/main/java/com/ycncc/vuefile");
//            createFile(fileName, FileType.vue_index, list, "/Users/yang/work/workspace/create_java_file_tool/src/main/java/com/ycncc/vuefile");
//            createFile(fileName, FileType.vue_request, list, "/Users/yang/work/workspace/create_java_file_tool/src/main/java/com/ycncc/vuefile");

        }
    }

    public static void createFile(String entityName, FileType fileType, List<Map<String, String>> list, String outputPath) {
        String template = "";
        try {
            template = FileFactory.readTemplate(fileType.getText() + ".template");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, Object> params = new HashMap<>();
        params.put("entityNameUp", entityName);

        String substring = entityName.substring(0, 1);
        String entityNameLow = entityName.replaceFirst(substring, substring.toLowerCase());

        params.put("entityNameLow", entityNameLow);
        params.put("filds", list);


        SpringTemplateEngine engine = new SpringTemplateEngine();
        StringTemplateResolver resolver = new StringTemplateResolver();
        engine.setTemplateResolver(resolver);
        Context context = new Context();
        context.setVariables(params);
        String process = engine.process(template, context);
        File file = new File(outputPath += "/" + entityNameLow);
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(outputPath + "/" + (fileType.equals(FileType.vue_request) ? entityNameLow + ".js" : fileType.getPath()));
        if (file.exists()) {
            return;
        }

        FileWriter writer;
        try {
            writer = new FileWriter(outputPath + "/" + (fileType.equals(FileType.vue_request) ? entityNameLow + ".js" : fileType.getPath()));
            writer.write(process);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readTemplate(String templateName) throws Exception {
        File serviceFile = new File(templateName);
        BufferedReader br = new BufferedReader(new FileReader(serviceFile));
        String s = "";
        String result = "";
        while ((s = br.readLine()) != null) {
            result += s + "\n";
        }
        br.close();
        return result;
    }
}
