package prgm9;
import java.util.Scanner;
public class Mstprims {
	int n,cost[][],t[][],mincost;
	public Mstprims(int n)
	{
		this.n=n;
		cost=new int[n+1][n+1];
		t=new int[n][3];
		
	}
	public void read()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the cost adjacency matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=in.nextInt();
		
	}
	public void mst()
	{
		int l=1,k=1;
		int near[]=new int[n+1];
		int min=9999;
		for(int i=1;i<=n;i++)
			for (int j=i+1;j<=n;j++)
				if(cost[i][j]<min)
				{ 
					min=cost[i][j];
					k=i;
					l=j;
				}
		mincost=cost[k][l];
		for(int v=1;v<=n;v++)
			if(cost[v][k]<cost[v][l])
					near[v]=k;
			else
				near[v]=l;
		near[k]=near[l]=0;
		t[1][1]=k;
		t[1][2]=l;
		int v=1,j=1;
				for(int i=2;i<=n-1;i++)
				{
					int mins=9999;
					for(v=1;v<=n;v++)
						if(near[v]!=0 && cost[v][near[v]]<mins)
						{
							mins=cost[v][near[v]];
							j=v;
						}
					t[i][1]=j;
					t[i][2]=near[j];
					mincost=mincost+cost[j][near[j]];
					near[j]=0;
					for(k=1;k<=n;k++)
						if(near[k]!=0&&cost[j][k]!=9999 && cost[j][k]<cost[k][near[k]])
							near[k]=j;
						}
		
				}
	public void display()
	{
		System.out.println("direction of spanning tree in mst");
		for(int i=1;i<=n-1;i++)
			System.out.println(t[i][1]+"-"+t[i][2]);
		System.out.println("cost of mst is:"+mincost);
	}

}
