package methodreference;

	interface Messageable{  
	    Message getMessage(String msg);  
	}  
	public class Message{  
	    Message(String msg){  
	        System.out.print(msg);  
	    }  
	}  
	
	 class ConstructorReference {  
	    public static void main(String[] args) {  
	        Messageable hello = Message::new;  
	        hello.getMessage("Hello");  
	    }  
	}  

