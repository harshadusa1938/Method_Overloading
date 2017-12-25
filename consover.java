package methodoverloading;

public class consover 
{

	int id;
	String name;
	String city;
	
	consover(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	consover(int id, String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	
	void show()
	{
		System.out.println(id+""+name+""+city);	
		
	} 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		consover c1= new consover(101, "Dhaval");
		consover c2 = new consover(102, "Harshad", "New York");
		
c1.show();
c2.show();
		
	}

}
