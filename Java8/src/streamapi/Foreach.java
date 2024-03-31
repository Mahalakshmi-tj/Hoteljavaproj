package streamapi;
import java.util.HashMap;
import java.util.Map;
 
public class Foreach {
	
	
	    public static void main(String[] args) {  
	    	Map<Integer, String> hashMap = new HashMap<Integer, String>();
	    	hashMap.put(1, "Jai");
	    	hashMap.put(2, "Mahesh"); 
	    	hashMap.put(3, "Vishal");  
	    	hashMap.put(4, "Vivek");   
	    	hashMap.put(5, "Hemant");   
	    	hashMap.put(6, "Naren");
	        //forEach to iterate and display each key and value pair    
	    	hashMap.forEach((key,value)->System.out.println(key+" - "+value));
	    }  
}
