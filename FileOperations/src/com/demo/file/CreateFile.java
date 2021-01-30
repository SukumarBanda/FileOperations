package com.demo.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		String fileName = "//home//mallari//javademo//createFile.txt";
		File newFile = new File(fileName);

		if (!newFile.exists()) {
			newFile.createNewFile();
			if (newFile.length() == 0) {
				System.out.println("empty file is created");
			} else {
				System.out.println("file is not empty after creation");
			}
		} else {
			System.out.println("File already exists");
		}

		FileWriter writer = new FileWriter(newFile);
		writer.write("Sukumar is coding in Java");
		writer.flush();
		writer.close();
		File readObj = new File(fileName);

		Scanner scan = new Scanner(readObj);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			System.out.println(str);
		}
		scan.close();
	}

}
