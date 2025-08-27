package com.day4;

import java.io.*;

public class FileWriting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(
					new FileReader("C:\\Users\\PrakashPramanik\\OneDrive - engineersmind\\Desktop\\text.txt"));

			bw = new BufferedWriter(
					new FileWriter("C:\\Users\\PrakashPramanik\\OneDrive - engineersmind\\Desktop\\copied_text.txt"));

			String data;
			while ((data = br.readLine()) != null) {
				bw.write(data);
				bw.newLine();
			}

			System.out.println("File content copied successfully.");

		} catch (FileNotFoundException e) {
			System.out.println("Source file not found.");
			e.printStackTrace();
		} finally {

			if (br != null)
				br.close();
			if (bw != null)
				bw.close();
		}
	}
}
