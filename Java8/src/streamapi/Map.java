package streamapi;
import java.util.Arrays;
import java.util.List;

public class Map {

	public static void main(String args[])
	{
		List<String> names = Arrays.asList("jaya","daisy");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}
}
