package com.sapient.AverageIncome;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DataManipulation {

	static List<InputDetail> Data = new ArrayList<InputDetail>();

	public DataManipulation(){}
	public static void parseInput(String line) {		
		System.out.println(line);
		String [] arr = line.split(",");
		Data.add(new InputDetail(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4])));		
	}

	public static void writeData() {
		String output = "";
		FileWriter fw;
		try {
			fw = new FileWriter("E:\\pre-learning-program-2\\assignments\\Week 2 Assignments\\week2 Assignment 3\\sample_output.csv");
				Collections.sort(Data);
				for(var detail : Data) {
					output+=detail;
					System.out.println(detail);
				}
			fw.write(output);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

