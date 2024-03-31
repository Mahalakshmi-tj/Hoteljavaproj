package hii;
import java.util.Scanner;
public class mett {
	
	public static void main(String[] args)
	{
	int n;
	int result=0;

	Scanner sc = new Scanner(System.in);

	 System.out.println("enter the number n");
	 n=sc.nextInt();
	 
	for(int i=1;i<=n;i++)
	{
	if(i%2==0)
	result=result+i;
	}
	System.out.println("the sum of even numbers is"+""+result);
	}
	}

