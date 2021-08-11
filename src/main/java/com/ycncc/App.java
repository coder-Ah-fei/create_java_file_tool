package com.ycncc;

import com.ycncc.common.enums.FileType;
import com.ycncc.factory.FileFactory;
import com.ycncc.factory.FileRepositoryFactory;
import com.ycncc.factory.FileServiceFactory;
import com.ycncc.factory.FileServiceImplFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author yang
 * @date 2020-12-09
 */
public class App {
	
	public static void main(String[] args) {
		App app = new App();
		
	}
	
	JFrame jFrame = new JFrame();
	JPanel entitypathPanel, entityPacageNamePanel, buttonPanel;
	JLabel entityPathLabel, entityPacageNameLabel;
	JButton button;
	JTextField entityPath, entityPacageName;
	
	public App() {
		entitypathPanel = new JPanel();
		entityPathLabel = new JLabel("entity所在的路径：");
		entityPath = new JTextField(20);
		entitypathPanel.add(entityPathLabel);
		entitypathPanel.add(entityPath);
		
		
		entityPacageNamePanel = new JPanel();
		entityPacageNameLabel = new JLabel("entity所在的包名：");
		entityPacageName = new JTextField(20);
		entityPacageNamePanel.add(entityPacageNameLabel);
		entityPacageNamePanel.add(entityPacageName);
		
		
		buttonPanel = new JPanel();
		button = new JButton("开始");
		button.addActionListener(e -> {
			String filePath = entityPath.getText();
			String packageName = entityPacageName.getText();
			
			if (filePath == null || "".equals(filePath) || packageName == null || "".equals(packageName)) {
				JOptionPane.showMessageDialog(null, "两个字段不能为空", "提示", JOptionPane.ERROR_MESSAGE);
				return;
			}
			File file = new File(filePath + "/entity");
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				String name = files[i].getName();
				String[] split = name.split(".java");
				String fileName = split[0];

//				new FileServiceFactory().createFile(packageName, filePath, fileName);
//				new FileServiceImplFactory().createFile(packageName, filePath, fileName);
//				new FileRepositoryFactory().createFile(packageName, filePath, fileName);
//				new FileServiceFactory().createFile(packageName, filePath, fileName);
//				new FileServiceImplFactory().createFile(packageName, filePath, fileName);
//				new FileRepositoryFactory().createFile(packageName, filePath, fileName);
				
				FileFactory.createFile(packageName, "D:\\ideaworkspace\\auto_insurance_installment\\dao\\src\\main\\java\\com\\ycncc\\auto", fileName, FileType.form);
				FileFactory.createFile(packageName, "D:\\ideaworkspace\\auto_insurance_installment\\dao\\src\\main\\java\\com\\ycncc\\auto", fileName, FileType.dto);
				FileFactory.createFile(packageName, "D:\\ideaworkspace\\auto_insurance_installment\\dao\\src\\main\\java\\com\\ycncc\\auto", fileName, FileType.repository);
				FileFactory.createFile(packageName, "D:\\ideaworkspace\\auto_insurance_installment\\service\\src\\main\\java\\com\\ycncc\\auto", fileName, FileType.service);
				FileFactory.createFile(packageName, "D:\\ideaworkspace\\auto_insurance_installment\\service\\src\\main\\java\\com\\ycncc\\auto", fileName, FileType.serviceImpl);
				FileFactory.createFile(packageName, "D:\\ideaworkspace\\auto_insurance_installment\\api\\src\\main\\java\\com\\ycncc\\auto", fileName, FileType.controller);

//				FileFactory.createFile(packageName, filePath, fileName, FileType.form);
//				FileFactory.createFile(packageName, filePath, fileName, FileType.dto);
//				FileFactory.createFile(packageName, filePath, fileName, FileType.repository);
//				FileFactory.createFile(packageName, filePath, fileName, FileType.service);
//				FileFactory.createFile(packageName, filePath, fileName, FileType.serviceImpl);
//				FileFactory.createFile(packageName, filePath, fileName, FileType.controller);
			
			
			}
			JOptionPane.showMessageDialog(null, "操作完成", "提示", JOptionPane.INFORMATION_MESSAGE);
		});
		buttonPanel.add(button);
		
		jFrame.setLayout(new GridLayout(4, 1));
		jFrame.setTitle("代码生成小助手");
		jFrame.setSize(500, 200);
		jFrame.setLocationRelativeTo(null); // 在屏幕中间显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口退出程序
		jFrame.setVisible(true);
		jFrame.setResizable(true);
		
		jFrame.add(entitypathPanel);
		jFrame.add(entityPacageNamePanel);
		jFrame.add(buttonPanel);
		
		
	}
	
	
}
