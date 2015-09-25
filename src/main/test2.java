package main;

import java.util.Date;

public class test2
{
	
	public static int getTimeInterval(Date date)
	{
		Date curr_date = new Date();
		
		return (int)( (curr_date.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
	}
}