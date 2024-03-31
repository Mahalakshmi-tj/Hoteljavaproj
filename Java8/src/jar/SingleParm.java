package jar;

public interface SingleParm {

	
	    public String say(String name);  
	}  
	  
	 class Express
	{  
	    public static void main(String[] args) 
	    {  
	        // Lambda expression with single parameter.  
	        SingleParm s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Sonoo"));  
	          
	        // You can omit function parentheses    
	        SingleParm s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.say("Sonoo"));  
	    }  
	}  

