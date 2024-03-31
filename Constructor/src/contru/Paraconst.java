package contru;

public class Paraconst {

	int id;
	String name;
	
	Paraconst(int i,String n)
	{
		id=i;
		name=n;	 
	}
	
	void display()
	{
		System.out.println(id+ " " +name); 
	}
	
	public static void main(String args[])
	{
		Paraconst s1 = new Paraconst(11,"anu");
		Paraconst s2 = new Paraconst(13,"niya");
		s1.display();
		s2.display();
	}
	
}
