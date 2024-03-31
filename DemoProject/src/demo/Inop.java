package demo;
 import java.util.Scanner;
public class Inop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        //String s = "";
        /*while(scan.hasNext());
        {
            s=scan.nextLine();
        }*/
        
        scan.nextLine();
        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
	}

}
