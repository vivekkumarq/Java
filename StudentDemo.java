package program;
import java.util.Scanner;
public class StudentDemo {
public static void main(String[] args)
{
	int i;
	String usn;
	String name;
	String branch;
	String phonenumber;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number of students");
	int n= in.nextInt();
			Student[]students=new Student[n];
	System.out.println("enter the student details");
	for(i=0;i<n;i++)
	{
		System.out.println("enter students" + (i+1) + "\t"+"details\n");
	System.out.println("enter students USN");
	usn=in.next();
 System.out.println("enter students NAME");
 name=in.next();
 System.out.println("enter students BRANCH");
 branch=in.next();
 System.out.println("enter students PHONENUMBER");
 phonenumber=in.next();
 students[i]=new Student(usn,name,branch,phonenumber);
 
	}
	System.out.println("usn"+"\t"+"name"+"\t"+"branch"+"\t"+"phonenumber");
	for(i=0;i<n;i++)
	{
		System.out.println(students[i]);
		
	}
}

}
