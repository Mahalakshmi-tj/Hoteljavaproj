package stringjoiner;
import java.util.StringJoiner;

public class StrJoin {
public static void main(String args[])
{
	StringJoiner joinname= new StringJoiner(",","[","]");
	joinname.add("anu");
	joinname.add("kiara");
	joinname.add("luca");
	joinname.add("deera");
	System.out.println(joinname);
}
	
}