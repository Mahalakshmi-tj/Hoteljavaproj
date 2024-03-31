package methodreference;
import java.util.function.BiFunction;
//method reference to static method

public class BifunInMetref
{
	public static int addMethod(int a,int b)
	{
		return a+b;
	}	
}
 
class Meta
{
	public static void main(String args[])
	{
		BiFunction<Integer,Integer,Integer> p1 = BifunInMetref::addMethod;
		int result = p1.apply(10, 20);
		System.out.println(result);
	}
}