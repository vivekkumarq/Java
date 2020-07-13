package prgm2a;
import java.util.Scanner;
public class StaffDemo {
	public static void main(String[] args)
	{
		int i;
		String staffId ,name;
		float Salary;
		String phonenumber,domain,publication,skills,period;
		System.out.println("enter no. of staff to be created for each category(n>=3)");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		Teaching[] teachingstaff = new Teaching[n];
		Technical[] technicalstaff=new Technical[n];
		Contract[] Contractstaff=new Contract[n];
		System.out.println("enter the staff details");
		for(i=0;i<n;i++)
		{
			System.out.println("enter teaching staff"+(i+1)+"Details");
			System.out.println("enter teaching details (StaffId,name,salary,phonenumber,domain,publication");
			staffId=in.next();
			name=in.next();
			Salary=in.nextFloat();
			phonenumber=in.next();
			domain=in.next();
			publication=in.next();
			teachingstaff[i]=new Teaching(staffId,name,Salary,phonenumber,domain,publication);
			}

System.out.println("enter technical staff details");
for (i = 0; i < n; i++) {
System.out.println("Enter Technical staff" + (i + 1) + "Details");
System.out.println("Enter Technical staffDetails(StaffId,Name,Salary,PhoneNumber,Skills)");
staffId = in.next(); 
name = in.next();
Salary = in.nextFloat();
phonenumber = in.next();
skills = in.next(); 
technicalstaff[i] = new Technical(staffId,name, Salary,phonenumber, skills);
}
System.out.println("Enter Contract staff details");
for (i = 0; i < n; i++) 
{
System.out.println("Enter Contract staff" + (i + 1) + "Details");
System.out.println("Enter Contract staff details StaffId,Name,Salary,PhoneNumber,Period");
staffId = in.next(); 
name = in.next();
Salary = in.nextFloat();
phonenumber = in.next();
period = in.next();
Contractstaff[i] = new Contract(staffId,name,Salary,phonenumber,period);
}
System.out.println("Teaching Staff Details are as follows");
for (i = 0; i < n; i++) 
{
System.out.println(teachingstaff[i]);
}
System.out.println("Technical Staff Details are as follows");
for (i = 0; i < n; i++) 
{
System.out.println(technicalstaff[i]);
}
System.out.println("Contract Staff Details are as follows");
for (i = 0; i < n; i++) {
System.out.println(Contractstaff[i]);
}}}