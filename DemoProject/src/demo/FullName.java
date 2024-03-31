package demo;

public class FullName {

	String NameIs(String first,String second)
	{
		//String fullname = "";
		String fullname = first+""+second;
		return fullname;
	}
	
	public static void main(String args[]) 
	{
		//String fullname = "";
		FullName io = new FullName();
		String fullname = io.NameIs("Anu","Malar");
		System.out.println(fullname);
	}
}
