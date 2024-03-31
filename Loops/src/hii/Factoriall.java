package hii;

public class Factoriall {

	static int Facto(int n)
	{
	if(n==0)
	
		return 1;
	

		return n*Facto(n-1);
	}
	
	public static void main(String args[])
	{
		int n=5;
		System.out.println("factorial of"+" "+ n + " " +"is" + " "+Facto(5));
	}
	
	
	
}




