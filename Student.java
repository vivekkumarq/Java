package program;

public class Student {
	private String usn;
	private String name;
	private String branch;
	private String phonenumber;
	public Student(String usn,String name,String branch,String phonenumber)
	{
		this.usn=usn;
		this.name=name;
		this.branch=branch;
		this.phonenumber=phonenumber;
		
	}
	public String toString()
	{
		return usn+"\t"+name+"\t"+branch+"\t"+phonenumber;
		
	}
}
