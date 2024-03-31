package methodreference;
import java.util.function.*;

public class Arithmetica {

	public int add(int a,int b)
	{
		return a+b;
	}
}
 class Methodref
 {
	 public static void main(String args[])
	 {
		 BiFunction<Integer,Integer,Integer> addable = new Arithmetica()::add;
		 int result = addable.apply(10,10);
		 System.out.println(result);
	 }
 }