package prgm2b;

import java.util.StringTokenizer;

public class Customer {
	private String CustomerName;
	private String date;
	public Customer(String CustomerName,String date)
	{
		this.CustomerName=CustomerName;
		this.date=date;
		
	}
	public String toString()
	{
		String returnvalue=CustomerName;
		StringTokenizer tokenizer=new StringTokenizer(date,"/");
		System.out.println("the customer details are");
		while(tokenizer.hasMoreTokens())
		{
			returnvalue =returnvalue + "," +tokenizer.nextToken();
			
		}
		return returnvalue;
		
	}
}