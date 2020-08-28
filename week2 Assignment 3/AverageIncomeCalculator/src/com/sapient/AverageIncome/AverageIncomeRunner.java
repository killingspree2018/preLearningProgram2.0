package com.sapient.AverageIncome;

import java.io.IOException;

public class AverageIncomeRunner {

	public static void main(String[] args) throws IOException {
		
		String input = "E:\\pre-learning-program-2\\assignments\\Week 2 Assignments\\week2 Assignment 3\\sample_input.csv";
	    CsvParser.read(input);
	    DataManipulation.evaluateOutput();
	    DataManipulation.writeData();
	}

}
