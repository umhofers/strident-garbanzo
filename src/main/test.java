package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test
{
	public static void main (String [] args)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			int tmp = getTimeInterval(dateFormat.parse("2014-05-29"));
			
			System.out.println((tmp > 30));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Test!");
	}
	
	public static int getTimeInterval(Date date)
	{
		Date curr_date = new Date();
		
		return (int)( (curr_date.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
	}
}