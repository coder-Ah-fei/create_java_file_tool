package com.ycncc.factory;

import com.ycncc.common.enums.FileType;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 * 文件工厂
 *
 * @author yang
 * @date 2020-12-09
 */
public abstract class FileFactory {
	
	/**
	 * 创建file
	 */
	abstract void createFile(String packageName, String outputPath, String entityName);
	
	public static void createFile(String packageName, String outputPath, String entityName, FileType fileType) {
		String template = "";
		try {
			template = readTemplate(fileType + ".template");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, Object> params = new HashMap<>();
		params.put("packageName", packageName);
		params.put("entityNameUp", entityName);
		
		String substring = entityName.substring(0, 1);
		params.put("entityNameLow", entityName.replaceFirst(substring, substring.toLowerCase()));
		
		
		SpringTemplateEngine engine = new SpringTemplateEngine();
		StringTemplateResolver resolver = new StringTemplateResolver();
		engine.setTemplateResolver(resolver);
		Context context = new Context();
		context.setVariables(params);
		String process = engine.process(template, context);
		File file = new File(outputPath += fileType.getPath());
		if (!file.exists()) {
			file.mkdir();
		}
		file = new File(outputPath + "/" + entityName + fileType.getText() + ".java");
		if (file.exists()) {
			return;
		}
		
		FileWriter writer;
		try {
			writer = new FileWriter(outputPath + "/" + entityName + fileType.getText() + ".java");
			writer.write(process);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String readTemplate(String templateName) throws Exception {
		File serviceFile = new File("src/main/resources/template/" + templateName);
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
