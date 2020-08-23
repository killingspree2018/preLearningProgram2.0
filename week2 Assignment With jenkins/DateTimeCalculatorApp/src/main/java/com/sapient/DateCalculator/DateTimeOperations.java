package com.sapient.DateCalculator;

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
	
	
	public String subtract_format_days_months_years(Date d1,Date d2) {
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
	
	public String subtract_days(Date d1,Date d2) {
		d1 = sub(d1, d2);
		double totalDays = d1.getYear()*365.25 + d1.getMonth()*30.355 + d1.getdays();
		return (int)totalDays + (totalDays == 1 ? DAY_STRING[1] : DAY_STRING[0]);
	}
	
	public static void tomorrow(Date d){
		d.addDays(1);
	}
	public static void Dayaftertomorrow(Date d){	
		d.addDays(2);
	}
	public static void yesterday(Date d) throws Exception
	{
		d.subtractDays(1);
	}
	public static void  Daybeforeyesterday(Date d) throws Exception
	{
		d.subtractDays(2);
	}
	public static void lastWeek(Date d) throws Exception
	{
		d.subtractWeeks(1);
	}
	public static void nextWeek(Date d) {
		d.addWeeks(1);
	}
	public static void nextMonth(Date d)
	{
		d.addMonths(1);
	}
	public static void lastMonth(Date d) throws Exception
	{
		d.subtractMonths(1);
	}
	public static void nextYear(Date d)
	{
		d.addYears(1);
	}
	public static void lastYear(Date d) throws Exception
	{
		d.subtractYears(1);
	}
	public static void nWeeksAfter(Date d,int n)
	{
		d.addWeeks(n);
	}
	public static void nDaysAfter(Date d,int n)
	{
		d.addDays(n);
	}
	public static void nmonthsAfter(Date d,int n)
	{
		d.addMonths(n);
	}
	public static void nYearsAfter(Date d,int n)
	{
		d.addYears(n);
	}
	public static void nWeeksBefore(Date d,int n) throws Exception
	{
		d.subtractWeeks(n);
	}
	public static void nDaysBefore(Date d,int n) throws Exception
	{
		d.subtractDays(n);
	}
	public static void nMonthsBefore(Date d,int n) throws Exception
	{
		d.subtractMonths(n);
	}
	public static void nYearsBefore(Date d,int n) throws Exception
	{
		d.subtractYears(n);
	}
	
}
