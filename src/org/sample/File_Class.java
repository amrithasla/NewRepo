package org.sample;

import java.io.File;
import java.io.IOException;

public class File_Class {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\Ajay\\Downloads\\SLA\\Selenium");
	
//	boolean mkdir = f.mkdir();
//	System.out.println(mkdir);
	
//	boolean mkdirs = f.mkdirs();
//	System.out.println(mkdirs);

	boolean createNewFile = f.createNewFile();
	System.out.println(createNewFile);
	
	boolean canRead = f.canRead();
	System.out.println("Is this file can be read? :-" +canRead);
	
	boolean canWrite = f.canWrite();
	System.out.println("Check whether can we write into the file:- " +canWrite);
	
	boolean canExecute = f.canExecute();
	System.out.println("Check whether can we execute this file:- " +canExecute);
	
	boolean directory = f.isDirectory();
	System.out.println(directory);
	
	boolean file = f.isFile();
	System.out.println(file);
	
	System.out.println("List:-");
	
	String[] list = f.list();
	for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
	}
	
	System.out.println("List Files:-");
	
	File[] listFiles = f.listFiles();
	
	for (int i = 0; i < listFiles.length; i++) {
		System.out.println(listFiles[i]);
	}
	
	
	
	
}
}
