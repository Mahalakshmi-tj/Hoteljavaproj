package demo;
import java.util.Scanner;
public class Tables {

	public static void main(String args[])
	{
		int N;
		int i=0;
		int result;
		Scanner io = new Scanner(System.in);
		System.out.println("enter the number N");
		N=io.nextInt();
		for(i=1;i<=10;i++)
			{
			result =N*i;
			System.out.println(N + " x " + i+ " = " +result);
			}
	}
	
}
