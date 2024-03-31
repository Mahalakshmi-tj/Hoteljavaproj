package hello;
//Fahrenheit to celius
public class celius {

	double convert(double f)
	{
		double c=0.0;
		c=(f-32)*5/9;
		return c;
	}
	
	public static void main(String args[])
	{
		celius a = new celius();
		double c= a.convert(37);
		System.out.println("in celius is" +c);
	}
	
}
