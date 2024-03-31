package hello;

public class Grade {

	double percent(double phy,double bio,double chem)
	{
		double per=(phy+bio+chem)*100/150;
		return per;
	}
	
	public static void main(String args[])
	{
		double phy=46.35;
		double bio=48;
		double chem= 44;
		
		
		Grade s1 = new Grade();
		double per=s1.percent(phy, bio, chem);
		System.out.println("percentage is" +per);
		
		if(per<35)
		{
			System.out.println("fail");
		}
		if(per>40&&per<60)
		{
			System.out.println("Second calss");
		}
		if(per>60&&per<75)
		{
			System.out.println("First calss");
		}
		if(per>75)
		{
			System.out.println("excellent");
		}
		
	}
	
	
	
}
