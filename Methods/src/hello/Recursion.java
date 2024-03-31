package hello;
//Recursion
public class Recursion {

	 public static void main(String[] args) 
	 {
	    int result = sum(10);
	    System.out.println(result);
	 }
	 
	  public static int sum(int k) 
	  {
	    if (k > 0) {
	      return k + sum(k - 1);//method calling itself
	  } 
	   else 
	   {
	      return 0;
	    }
	  }
	}

