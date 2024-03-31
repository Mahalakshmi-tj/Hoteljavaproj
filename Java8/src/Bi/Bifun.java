package Bi;

import java.util.function.*;
public class Bifun {
 
	public static void main(String args[])
	{
		BiFunction<Integer,Integer,Integer> f1 = (a,b) -> a+b;
		System.out.println("result is"+ f1.apply(12,8));
		Function<Integer,Integer> f2 = (c) -> c/2;
		System.out.println("result2 is"+ f1.andThen(f2).apply(10,20));
	}
	
}
