package com.sapient.transactions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DataManipulation {

	static List<Transactions> Data = new ArrayList<Transactions>();
	
	public static void parseInput(String line) {		
		System.out.println(line);
		String [] arr = line.split(",");
		if(arr[2].equals("")) {
			Data.add(new NormalTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[3],arr[4],Integer.parseInt(arr[5]),arr[6] == "Y" ? true : false));
		}
		else {
			Data.add(new IntradayTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],arr[4],Integer.parseInt(arr[5])));
		}
	}

	public static void writeData() {
		String output = "";
		try {
			FileWriter fw = new FileWriter("E:\\pre-learning-program-2\\assignments\\Week 2 Assignments\\week2 Assignment 2\\sample_output.csv");
			Collections.sort(Data);
			for( Transactions x : Data) {
				output += x;
			}
			fw.write(output);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

