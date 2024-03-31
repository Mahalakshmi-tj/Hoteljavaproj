package methodreference;
//method reference to static method
	interface Sayable{  
	    void say();  
	}  
	public class Met {  
	    public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = Met::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	    }  
	}  

