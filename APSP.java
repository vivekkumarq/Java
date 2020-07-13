package prgm10a;
import java.util.Scanner;
public class APSP {
	int n;
	int c[][];
	int d[][];
	APSP(int n)
	{
		this.n=n;
		c=new int[n+1][n+1];
		d=new int[n+1][n+1];
		
	}
	public void read()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter cost adjacency matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				c[i][j]=in.nextInt();
		
		
	}
	public void floyd()
	{
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				d[i][j]=c[i][j];
			}
		for (int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(d[i][j]>(d[i][k]+d[k][j]))
						d[i][j]=d[i][k]+d[k][j];
	}
	public void display()
	{
		System.out.println("shortest path is");
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
		System.out.println(d[i][j] + "\t");
	System.out.println("\n");
	
}
	}

}
