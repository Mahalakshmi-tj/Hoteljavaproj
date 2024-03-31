package demo;
import java.util.Scanner;
public class InopFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
            //Complete this line
        }
        System.out.println("================================");
	}

}
/*Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer
 will be in the inclusive range from  to 0 t0 999.

Output Format

In each line of output there should be two columns:The first column contains 
the String and is left justified using exactly  15 characters.
The second column contains the integer, expressed in exactly  digits; 
if the original input has less than three digits, you must pad your output's 
leading digits with zeroes.*/