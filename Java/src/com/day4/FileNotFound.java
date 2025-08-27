package com.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader("C:\\Users\\PrakashPramanik\\OneDrive - engineersmind\\Desktop\\text.txt"));
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		finally {
			br.close();
		}

	}
}
