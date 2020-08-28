package com.sapient.AverageIncome;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DataManipulation {

	static List<InputDetail> Data = new ArrayList<InputDetail>();
	static List<InputDetail> Output = new ArrayList<InputDetail>();

	public DataManipulation(){}
	public static void parseInput(String line) {		
		System.out.println(line);
		String [] arr = line.split(",");
		Data.add(new InputDetail(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4])));		
	}
	
	private static boolean containsDetail(String country, String gender) {
		for(var x: Output) {
			if(x.getCountry().equals(country) && x.getGender().equals(gender)) {
				return true;
			}
		}
		return false;
	}
	
	private static void addDetail(InputDetail detail) {
		Double sum = 0.0;
		int n=0;
		for(var x:Data) {
			if(x.getCountry() == detail.getCountry() && x.getGender() == detail.getGender()) {
				n+=1;
				sum += x.getAverageIncome();
			}
		}
		Output.add(new InputDetail(detail.getCountry(),detail.getGender(),sum/n));
	}
	
	public static void evaluateOutput() {
		for(var detail:Data) {
			if(!containsDetail(detail.getCountry(),detail.getGender()))
				addDetail(detail);
		}
	}

	public static void writeData() {
		String output = "";
		FileWriter fw;
		try {
			fw = new FileWriter("E:\\pre-learning-program-2\\assignments\\Week 2 Assignments\\week2 Assignment 3\\sample_output.csv");
				Collections.sort(Output);
				for(var detail : Output) {
					output+=detail;
					//System.out.println(detail);
				}
			fw.write(output);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

