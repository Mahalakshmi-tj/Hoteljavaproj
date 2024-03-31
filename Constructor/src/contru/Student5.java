package contru;
//constructor overloading
public class Student5 {

	int id;
	String name;
	int age;
	
	Student5(int i,String n)
	{
		id=i;
		name=n;
		//System.out.println(id+ " " +name);
	}
	
	Student5(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
		//System.out.println(id+ " "+name+ " " +age);
	}
	
	void display() 
	{
		System.out.println(id+" "+name+" " +age);
	}
	
	public static void main(String args[])
	{
		Student5 s1 = new Student5(1,"nira");
		Student5 s2 = new Student5(2,"lio",90);
		s1.display();
		s2.display();
	}
	
}
