import java.util.Scanner;
public class Inputfrmuser {
  
	public static void main(String args[]) 
	{
		String name;
		int a;
		float b;
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter name");
		name = io.next();
		System.out.println("enter a");
		a=io.nextInt();
		System.out.println("enter b");
		b=io.nextFloat();
	    System.out.println(name);
	    System.out.println(a);
	    System.out.println(b);
	}
	
	
}
