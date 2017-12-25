package methodoverloading;

public class datatypeargument 
{
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		noofargument obj1= new noofargument();
		obj1.sum(10.5, 20.5);
		obj1.sum(10, 20);		
	}

}
