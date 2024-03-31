package streamapi;

	import java.util.ArrayList;
	import java.util.List;
	 
	public class Test{  
	    public static void main(String[] args) {  
	    	List<String> names = new ArrayList<String>();
	    	names.add("Jai");
	    	names.add("Mahesh");
	    	names.add("Ajaya");
	    	names.add("Hemant");
	    	names.add("Vishal");
	    	//Using Stream and Lambda expression
	    	long count = names.stream().filter(str->str.length()<5).count();
	            System.out.println(count+" strings with length less than 5");
	    }  
	}
/* In the above example, the stream() method returns a stream of all the names.
 The filter() method returns another stream of names with length less than 5 and
  the count() method reduces this stream to the result.*/

