package streamapi;
import java.util.stream.*;

public class CreateStream {
	
	    public static void main(String[] args) {  
	    	//Create Stream using Stream.of
	        Stream<String> names = Stream.of("jai","Hemanth");
	        names.forEach(System.out::println);
	 
	        System.out.println("--------------");
	        //Create stream using array of elements
	        Stream<Integer> intStream1 = Stream.of(new Integer[]{1,2,3,4,5});
	        intStream1.forEach(System.out::println);
	    }  
	}

