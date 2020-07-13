package prg1b;
import java.util.Scanner;
public class StackDemo {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter the size of stack");
int n=in.nextInt();
Stack s=new Stack(n);
int item;
while(true)
{
	System.out.println("enter your choice");
	System.out.println("1.push\n 2.pop\n 3.Display\n");
	int ch=in.nextInt();
	switch(ch)
	{
		case 1: System.out.println("enter the element to be inserted");
		item=in.nextInt();
		s.push(item);
		break;
		
		case 2: 
			if (s.pop()!=0)
				System.out.println("popped item is +item");
			break;
		case 3:
			s.show();
			break;
			default: System.exit(0);
	}
}
}
}