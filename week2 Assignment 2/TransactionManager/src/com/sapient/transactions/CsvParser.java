package com.sapient.transactions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvParser {
		   
	   public static void read(String csvFile) {
	      try {
		         File file = new File(csvFile);
		         FileReader fr = new FileReader(file);
		         Scanner rd = new Scanner(fr);
		         DataManipulation.parseInput(rd.nextLine().substring(3));
		         while(rd.hasNextLine()) {
		        	 DataManipulation.parseInput(rd.nextLine());
		         }
		         rd.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
}
