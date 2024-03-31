package demo;
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter testcase");
	        int t=in.nextInt();
	        //for(int i=0;i<t;i++){
	        	System.out.println("enter a");
	            int a = in.nextInt();
	            System.out.println("enter b");
	            int b = in.nextInt();
	            System.out.println("enter n");
	            int n = in.nextInt();
	            
	            int sum = a;
	            for (int j = 0; j < n; j++) {
	                sum += b * Math.pow(2, j);
	                System.out.print(sum + " ");
	            }
	            System.out.println();
	        //}
		
	}

}
