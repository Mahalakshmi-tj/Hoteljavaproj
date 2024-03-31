package Bi;

import java.util.function.BiFunction;  
import java.util.function.Function;

public class Biexamp {

	public static void main(String args[])   
	{  
		
	BiFunction <Integer, Integer, Integer> bfobj = (x, y) -> x + y;  
	//invoking the apply() method  and andThen()
	Function <Integer,Integer> foj = (c) -> c/2;
	System.out.println("The result is: " + bfobj.andThen(foj).apply(70, 10));  
	}   
	}  

