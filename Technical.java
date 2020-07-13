package prgm2a;
public class Technical extends Staff {
	private String skills;
	public Technical(String staffId,String name,float Salary,String phonenumber,String skills)
	{
		super(staffId,name,Salary,phonenumber);
		this.skills=skills;
	}
	public String tostring() {
		return super.toString()+"\t"+"SKILLS:"+skills;
				
	}

}