package prgm2a;
public class Teaching extends Staff
{
	private String domain;
	private String publication;
	public Teaching(String staffId,String name,float Salary,String phonenumber,String domain,String publication)
	{
		super(staffId,name,Salary,phonenumber);
		this.domain=domain;
		this.publication=publication;
	}
	public String toString() 
	{
		return super.toString()+"\t"+"domain"+domain+"\t"+"publication"+publication;
	}
}
	