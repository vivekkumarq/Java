package prg1b;

public class Stack {
int a[];
int top;
public 
Stack(int n)
{
	a=new int[n];
	top=-1;
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack overflow");
			return 0;
			
		}
		else
			return(a[top--]);
		
					
	}
	void push(int n) {
		if(top==a.length-1)
			System.out.println("stack overflow");
		else
			a[++top]=n;
	}
	void show()
	{
		if (top==-1)
			System.out.println("stack empty");
		else
		{
			System.out.println("stack elements are:");
			for(int i=top;i>=0;i--)
				System.out.println(a[i]);
			
		}
	}
}

