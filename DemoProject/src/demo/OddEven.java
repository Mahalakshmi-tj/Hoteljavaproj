package demo;

import java.util.Scanner;
public class OddEven {

	
	public static void main(String args[])
	{
		int N;
		Scanner ob = new Scanner(System.in);
		N= ob.nextInt();
		/*int n=N%2;
		if(N%2==0 &&(N>=2 && N<=5)&& N>20)
        {
            System.out.println("Not Weired");
        }
        
        if(N%2==0 &&(N>=6 && N<=20))
        {
            System.out.println("Weired");
        }
        if(N%2==1)
        {
            System.out.println("Weired");
        }*/
		
		
int n=N%2;
        
        if(N%2==1)
        {
            System.out.println("Weird");
        }
        if(N%2==0 &&2<=N &&N<=5)
        {
            System.out.println("Not Weird");
        }
        if(N%2==0 && 6<=N && N<=20)
        {
            System.out.println("Weird");
        }
        if(N%2==0 && 20<N &&N<=100)
        {
            System.out.println("Not Weird");
        }
		
	}
}
