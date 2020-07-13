package prgm3b;
import java.util.*;
public class RandomThread implements Runnable {
	public void run()
	{
		int num;
		Random r= new Random();
try
{
	for(int i=0;i<6;i++)
	{
		
	num=r.nextInt(100);
	System.out.println("first thread started and generated a number is"+ " " +num);
	Thread.sleep(1000);
	}
	}
	catch(Exception ex)
{
		System.out.println(ex.getMessage());
}
}
}

