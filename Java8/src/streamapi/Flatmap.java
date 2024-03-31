package streamapi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Flatmap {
	 
	    public static void main(String[] args) {  
	    	try {
	            long noOfWords = Files.lines(Paths.get("C:\\Users\\2111941\\OneDrive - Cognizant\\Desktop\\complex.txt"))
	                                    .flatMap(l->Arrays.stream(l.split(" +")))
	                                    .distinct()
	                                    .count();
	            System.out.println("No Of Words: "+noOfWords);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }  
	}

