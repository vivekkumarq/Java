package prgm9;

import java.util.Scanner;

public class Prims {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the no. of vertices");
		int n= in.nextInt();
		Mstprims k=new Mstprims(n);
		k.read();
		k.mst();
		k.display();
	}

}
