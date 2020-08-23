package com.sapient.transactions;

import java.io.IOException;

public class TransactionRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String csvFile = "E:\\pre-learning-program-2\\assignments\\Week 2 Assignments\\week2 Assignment 2\\sample_input.csv";
	    CsvParser.read(csvFile);
	    DataManipulation.writeData();
	}

}
