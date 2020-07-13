package prgm6;

import java.util.Scanner;

public class KnapsackDP {
	public void solve(int[] wt,int[] val,int W,int N)
	{
		int i,j;
	int[][] sol= new int[N+1][W+1];
	for(i=0;i<=N;i++)
	{
		for(j=0;j<=W;j++)
		{
			if(i==0 || j==0)
				sol[i][j]=0;
			else if (wt[i]>j)
				sol[i][j]=sol[i-1][j];
			else 
				sol[i][j]=Math.max((sol[i-1][j]),(sol[i-1][j-wt[i]]+val[i]));
			
		}
	}
	System.out.println("the optimal solution is"+sol[N][W]);
	int[] selected =new int[N+1];
	for(i=0;i<N;i++)
	{
		selected[i]=0;
	}
		i=N;
		j=W;
		while(i>0 && j>0)
		{
			if(sol[i][j]!=sol[i-1][j])
			{
				selected[i]=1;
			j=j-wt[i];
			
		}
		i--;
		}
		System.out.println("items selected");
		for(i=1;i<N+1;i++)
			if(selected[i]==1)
			System.out.println(i+"");
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		KnapsackDP ks=new KnapsackDP();
		System.out.println("enter the number of elements");
		int n=in.nextInt();
		int[] wt=new int[n+1];
		int[] val=new int[n+1];
		System.out.println("enter the weight of " + " " +n+ " " + "elements");
		for(int i=1;i<=n;i++)
			wt[i]=in.nextInt();
		System.out.println("enter the value of" + " " +n+ " " +"elements");
		for(int i=1;i<=n;i++)
		{
			val[i]=in.nextInt();
			
		}
		System.out.println("enter the knapsack weight");
	int W=in.nextInt();
	ks.solve(wt,val,W,n);
	}

}
