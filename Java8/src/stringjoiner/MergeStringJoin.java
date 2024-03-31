package stringjoiner;
import java.util.StringJoiner;

public class MergeStringJoin {
public static void main(String args[])
{
	StringJoiner Joinname = new StringJoiner(",","[","]");
	Joinname.add("neha");
	Joinname.add("meena");
	
	StringJoiner joinname1 = new StringJoiner(",","[","]");
	joinname1.add("gurupreet");
	joinname1.add("sara");
	
	
	StringJoiner merge = Joinname.merge(joinname1);
	System.out.println(merge);
}
	
}
