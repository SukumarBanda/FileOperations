package com.demo.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileDir {
	public static void main(String[] args) throws IOException {

		boolean flag = false;

		File stockFile = new File("/home/mallari/javademo/demofile.txt");

		try {
			if (stockFile.exists()) {
				System.out.println(stockFile + " already exists");
			} else {
				flag = stockFile.createNewFile();
				if(flag)
					System.out.println("stockFile " + stockFile + " created successfully");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		boolean flagDir = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter path to directory:");
		String filePath = scan.nextLine();

		File dir = new File(filePath);
		try {
			if (dir.exists()) {
				System.out.println("Directory already exixts");
			} else {
				flagDir = dir.mkdir();
				if(flagDir)
					System.out.println("Directory " + dir + " successfully created");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
