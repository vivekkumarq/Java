package prgm2a;

public class Staff {
protected String staffId;
protected String name;
protected float Salary;
protected String phonenumber;
public Staff(String staffId,String staffname,float staffsalary,String staffphonenumber)
{
	this.staffId=staffId;
	this.name=staffname;
	this.Salary=staffsalary;
	this.phonenumber=staffphonenumber;
	}
public String toString()
{
	return "STAFFID"+staffId+"\t"+"NAME"+name+"\t"+"SALARY"+Salary+"PHONENUMBER"+phonenumber;
	}
}

