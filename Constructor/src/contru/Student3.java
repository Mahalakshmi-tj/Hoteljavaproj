package contru;

public class Student3 {

	
	//Let us see another example of default constructor  
	//which displays the default values  
	
	int id;  
	String name;  
	
	void display()
	{
		System.out.println(id+" "+name);
	}  
	  
	public static void main(String args[]){  
	//creating objects  
	Student3 s1=new Student3();  
	Student3 s2=new Student3();  
	//displaying values of the object  
	s1.display();  
	s2.display();  
	 
	}  
	
	
}
