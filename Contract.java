package prgm2a;

public class Contract extends Staff {
	private String period;
	public Contract(String staffId,String staffname,float staffSalary,String staffphonenumber,String period)
	{
super(staffId,staffname,staffSalary,staffphonenumber);
this.period=period;
}
public String toString() {
	return super.toString() + "\t"+ "Period:" + period ;
	
	}
}
