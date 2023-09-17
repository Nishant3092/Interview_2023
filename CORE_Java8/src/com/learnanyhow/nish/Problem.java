package com.learnanyhow.nish;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;



public class Problem {

	public static void main(String[] args) {

		System.out.println("List of repeated word from file and their count");

	}

	// Method - 1
	public static Map<String, Integer> buildWordMap(String fileName) {

		// Using diamond operator for clean code
		Map<String, Integer> wordMap = new HashMap<>();

		// Using try-with-resource statement for automatic resource management
		try (FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis);
				BufferedReader br = new BufferedReader(new InputStreamReader(dis))) {

			// words are separated by whitespace
			Pattern pattern = Pattern.compile("\\s+");
			String line = null;

			while ((line = br.readLine()) != null) {

				// do this if case sensitivity is not required i.e. Java = java
				line = line.toLowerCase();
				String[] words = pattern.split(line);
				for (String word : words) {
					if (wordMap.containsKey(word)) {
						wordMap.put(word, (wordMap.get(word) + 1));
					} else {
						wordMap.put(word, 1);
					}
				}
			}
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
		return wordMap;
	}

}
