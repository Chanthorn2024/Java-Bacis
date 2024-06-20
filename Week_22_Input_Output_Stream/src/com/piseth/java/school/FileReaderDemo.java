package com.piseth.java.school;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) {
		char[] data = new char[100];
		try {
			try (Reader reader = new FileReader("C:\\Files out of drive C\\Data2.txt")) {
				System.out.println(reader.ready());
				reader.read(data);
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
