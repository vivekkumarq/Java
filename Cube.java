package prgm3b;

public class Cube implements Runnable{
	public int x;
	public Cube(int x)
	{
		this.x=x;
		
	}
	public void run()
	{
		//System.out.println(" From The third thread the - Cube of \t " + x + "is" + x*x*x );
		
		System.out.println("From Third thread - Cube of " + x + " " + " is: " +" " + x * x * x);
	}

}
