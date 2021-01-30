package com.demo.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateRead {
	public static void main(String[] args) throws IOException {
		String readFrom = "/home/mallari/javademo/readFile.txt";
		String fileName = "/home/mallari/javademo/ReadAnother.txt";
		
		File iFile = new File(readFrom);
		File file = new File(fileName);
		
		if(!file.exists()) {
			file.createNewFile();
			if(file.length()==0) {
				FileWriter writeTo = new FileWriter(fileName);
				Scanner scan = new Scanner(iFile);
				while(scan.hasNext()) {
					String str = scan.nextLine();
					writeTo.write(str+"\n");
				}
				writeTo.flush();
				writeTo.close();
				scan.close();
			}
		}
		else {
			System.out.println("File "+ file+ " already exists");
		}
		
		Scanner currentFile = new Scanner(file);
		while(currentFile.hasNext()) {
			String curtFile = currentFile.nextLine();
			System.out.println(curtFile);
		}
		
		currentFile.close();
		
	}
}
