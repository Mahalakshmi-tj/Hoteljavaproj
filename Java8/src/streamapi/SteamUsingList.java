package streamapi;
import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

// create stream using list

public class SteamUsingList {
	 
	    public static void main(String[] args) {  
	    	List<String> names = Arrays.asList("Vishal","Naren");
	    	Stream<String> namesStream = names.stream();
	    	namesStream.forEach(System.out::println);
	    }  
}
