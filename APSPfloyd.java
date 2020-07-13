package prgm10a;
import java.util.Scanner;
public class APSPfloyd 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of vertices");
		int n=in.nextInt();
		APSP A=new APSP(n);
		A.read();
		A.floyd();
		A.display();
		
	}

}
