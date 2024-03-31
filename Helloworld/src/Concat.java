
public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String name ="aman";
		String name2 = "anup";
		String fullname = name+ " " + "and" + " " +name2;
		System.out.println(fullname);
		System.out.println(fullname.length());// length
		System.out.println(name.charAt(1));//character at 
	    String name3 = name2.replace('p', 'l');
	    System.out.println(name3);//replaced name2
		System.out.println(fullname.substring(0,4 ));//substring
	}

}
