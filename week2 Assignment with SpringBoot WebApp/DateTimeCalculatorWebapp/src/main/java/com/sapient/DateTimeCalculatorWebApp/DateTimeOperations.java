package com.sapient.DateTimeCalculatorWebApp;

public class DateTimeOperations {
	
	final String[] DAY_STRING = {" days "," day "};
	final String[] MONTH_STRING = {" months "," month "};
	final String[] YEAR_STRING = {" years "," year "};
	
	public Date add(Date d1,Date d2) {
		d1.addYears(d2.getYear());
		d1.addMonths(d2.getMonth());
		d1.addDays(d2.getdays());
		return d1;
	}
	
	public Date sub(Date d1,Date d2) {
		try {
			d1.subtractYears(d2.getYear());
			if(d1.getMonth() != d2.getMonth())
				d1.subtractMonths(d2.getMonth());
			else
				d1.setMonth(0);
			if(d1.getdays() != d2.getdays()) 
				d1.subtractDays(d2.getdays());
			else
				d1.setdays(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d1;
	}
	
	
	public String subtractinformatdaysmonthsyears(Date d1,Date d2) {
		d1 = sub(d1,d2);
		String result = "";
		if(d1.getdays()>0) {
			result += d1.getdays() + (d1.getdays() == 1 ? DAY_STRING[1] : DAY_STRING[0]);
		}
		if(d1.getMonth()>0) {
			result += d1.getMonth() + (d1.getMonth() == 1 ? MONTH_STRING[1] : MONTH_STRING[0]);
		}
		if(d1.getYear()>0) {
			result += d1.getYear() + (d1.getYear() == 1 ? YEAR_STRING[1] : YEAR_STRING[0]);
		}
		return result.trim();
	}
	
	public String subtractindays(Date d1,Date d2) {
		d1 = sub(d1, d2);
		double totalDays = d1.getYear()*365.25 + d1.getMonth()*30.355 + d1.getdays();
		return (int)totalDays + (totalDays == 1 ? DAY_STRING[1] : DAY_STRING[0]);
	}
	
	public static String weeknumber(Date d) {
		return String.valueOf(d.weekNumber());
	}
	
	public static String dayofweek(Date d) {
		return d.getDay();
	}
	public static String tomorrow(Date d){
		d.addDays(1);
		return d.toString();
	}
	public static String dayaftertomorrow(Date d){	
		d.addDays(2);
		return d.toString();
	}
	public static String yesterday(Date d) throws Exception
	{
		d.subtractDays(1);
		return d.toString();
	}
	public static String  daybeforeyesterday(Date d) throws Exception
	{
		d.subtractDays(2);
		return d.toString();
	}
	public static String lastweek(Date d) throws Exception
	{
		d.subtractWeeks(1);
		return d.toString();
	}
	public static String nextweek(Date d) {
		d.addWeeks(1);
		return d.toString();
	}
	public static String nextmonth(Date d)
	{
		d.addMonths(1);
		return d.toString();
	}
	public static String lastmonth(Date d) throws Exception
	{
		d.subtractMonths(1);
		return d.toString();
	}
	public static String nextyear(Date d)
	{
		d.addYears(1);
		return d.toString();
	}
	public static String lastyear(Date d) throws Exception
	{
		d.subtractYears(1);
		return d.toString();
	}
	public static String nweeksafter(Date d,int n)
	{
		d.addWeeks(n);
		return d.toString();
	}
	public static String ndaysafter(Date d,int n)
	{
		d.addDays(n);
		return d.toString();
	}
	public static String nmonthsafter(Date d,int n)
	{
		d.addMonths(n);
		return d.toString();
	}
	public static String nyearsafter(Date d,int n)
	{
		d.addYears(n);
		return d.toString();
	}
	public static String nweeksbefore(Date d,int n) throws Exception
	{
		d.subtractWeeks(n);
		return d.toString();
	}
	public static String ndaysbefore(Date d,int n) throws Exception
	{
		d.subtractDays(n);
		return d.toString();
	}
	public static String nmonthsbefore(Date d,int n) throws Exception
	{
		d.subtractMonths(n);
		return d.toString();
	}
	public static String nyearsbefore(Date d,int n) throws Exception
	{
		d.subtractYears(n);
		return d.toString();
	}
	
}
