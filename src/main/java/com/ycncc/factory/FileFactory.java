package com.ycncc.factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	
	public String readTemplate(String templateName) throws Exception {
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
