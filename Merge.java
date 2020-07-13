package prgm5;
import java.util.Scanner;
import java.util.Random;
public class Merge
{
	static void merge(int[] array,int low,int mid,int high)
	{
	int i=low;
	int j=mid+1;
	int k=low;
	int[] resarray;
	resarray=new int[high+1];
	while(i<=mid && j<=high)
	{
		if(array[i]<=array[j])
		{
			resarray[k]=array[i];
			i++;
			k++;
		}
		else
		{
			resarray[k]=array[j];
			j++;
			k++;
			
		}
		while(i<=mid)
			resarray[k++]=array[i++];
		while(j<=high)
		{
			resarray[k++]=array[j++];
		}
		for(int m=0;m<=high;m++)
		{
			array[m]=resarray[m];
		}
	}
	}
		static void msort(int[] array,int low,int high)
		{
			if(low<high)
			{
				int mid=(low+high)/2;
				msort(array,low,mid);
				msort(array,mid+1,high);
				merge(array,low,mid,high);
			}
		}
public static void main(String[] args)
{
	int[] array;
	int i;
	System.out.println("enter the size of array");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	array=new int[n];
	Random r=new Random();
	for(i=0;i<n;i++)
	{
		array[i]=r.nextInt(50000);
		
	}
	long startTime=System.nanoTime();
msort(array,0,n-1);
long StopTime=System.nanoTime();
long timetaken=StopTime-startTime;
System.out.println("the sorted array is:");
for(i=0;i<n;i++)
{
	System.out.println(array[i]);
}
System.out.println("time taken to sort is "+timetaken);
}
}
