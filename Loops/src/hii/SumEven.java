package hii;

public class SumEven {

	public static void main(String args[])
	{
		int i,sum=0;
		
		for(i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	
}
