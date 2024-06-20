package com.piseth.java.school;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			String text ="I love Java progrmming";
			Writer writer = new FileWriter("C:\\Files out of drive C\\Data2.txt", true);
			writer.write(text);
			// writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
