package prgm2b;
import java.util.Scanner;
public class CustomerDemo {
public static void main(String[] args)
{
	String CustomerName;
	String date;
	Scanner in=new Scanner(System.in);
	System.out.println("enter Customer name");
	CustomerName=in.next();
	System.out.println("enter date");
	date=in.next();
	Customer customers=new Customer(CustomerName,date);
	System.out.println(customers.toString());
	
}
}
