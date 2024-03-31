package hello;

public class Fah {

	double con(double c)
	{
		double f=0.00;
		f=(c*9)/5+32;
		return f;
	}
	
	public static void main(String args[])
	{
		Fah a = new Fah();
		double f= a.con(20);
		System.out.println("celius is" +f);
	}
	
}
