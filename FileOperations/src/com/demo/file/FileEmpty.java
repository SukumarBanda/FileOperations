package com.demo.file;

import java.io.File;

public class FileEmpty {
	
	public static void main(String[] args) {
		
		String filePath = "/home/mallari/javademo/readFile.txt";
		
		File filename = new File(filePath);
		
		if(filename.length()==0) {
			System.out.println("file is empty");
		}
		else {
			System.out.println("file is not empty");
		}
	}
}
