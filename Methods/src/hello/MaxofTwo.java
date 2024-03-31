package hello;

public class MaxofTwo {

	int Max(int a,int b)
	{
		if(a>b)
			return a;
		else
		return b;
		
	}
	
	public static void main(String args[])
	{
		int n;
		MaxofTwo s1= new MaxofTwo();
		n=s1.Max(100,20);
		System.out.println("number grater is" +n);
	}
}
