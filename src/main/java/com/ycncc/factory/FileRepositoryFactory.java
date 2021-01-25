package com.ycncc.factory;

import com.ycncc.common.enums.FileType;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：接收前台
 *
 * @author yang
 * @date 2020-12-09
 */
public class FileRepositoryFactory extends FileFactory {
	
	@Override
	public void createFile(String packageName, String outputPath, String entityName) {
		String template = "";
		try {
			template = readTemplate("repository.template");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, Object> params = new HashMap<>();
		params.put("packageName", packageName);
		params.put("entityNameUp", entityName);
		
		SpringTemplateEngine engine = new SpringTemplateEngine();
		StringTemplateResolver resolver = new StringTemplateResolver();
		engine.setTemplateResolver(resolver);
		Context context = new Context();
		context.setVariables(params);
		String process = engine.process(template, context);
		File file = new File(outputPath += "/repository");
		if (!file.exists()) {
			file.mkdir();
		}
		file = new File(outputPath + "/" + entityName + "Repository.java");
		if (file.exists()) {
			return;
		}
		
		FileWriter writer;
		try {
			writer = new FileWriter(outputPath + "/" + entityName + "Repository.java");
			writer.write(process);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
