package com.sapient.AverageIncome;

import java.util.HashMap;
import java.util.Map;

public class InputDetail implements Comparable {
	String country;
	String city;
	String gender;
	String currency;
	Double averageIncome;
	final Map<String,Double> conversion = new HashMap<String,Double>(){
		{
			put("GBP",0.67);
			put("INR",66.0);
			put("SGD",1.5);
			put("HKD",8.0);	
		}
	};
	public InputDetail(String city, String country, String gender, String currency, Double averageIncome) {
		super();
		if(country.equals("")) 
			this.country = city;
		else
			this.country = country;
		this.city = city;
		this.gender = gender;
		this.currency = currency;
		this.averageIncome = averageIncome/conversion.get(currency);
	}
	public InputDetail(String country, String gender, Double averageIncome) {
		super();
		this.country = country;
		this.city = "";
		this.gender = gender;
		this.currency = "";
		this.averageIncome = averageIncome;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAverageIncome() {
		return averageIncome;
	}
	public void setAverageIncome(Double averageIncome) {
		this.averageIncome = averageIncome;
	}
	@Override
	public String toString() {
		return country + "," + gender + "," + averageIncome + "\n";
	}
	@Override
	public int compareTo(Object o) {
		InputDetail x = (InputDetail)o;
		int genderCompare = this.getGender().compareTo(x.getGender());
		int incomeCompare = this.getAverageIncome().compareTo(x.getAverageIncome());
		int countryCompare = this.getCountry().compareTo(x.getCountry());
		if(countryCompare == 0) {
			if(genderCompare == 0) {
				return incomeCompare;
			}
			else {
				return genderCompare;
			}
		}
		else {
			return countryCompare;
		}
	}
}
