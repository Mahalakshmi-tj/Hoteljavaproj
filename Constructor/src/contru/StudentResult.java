package contru;

public class StudentResult 
{
	
		StudentResult(double English,double Maths, double Science)
		{
		double totalmarks=English+Maths+Science;
		System.out.println(totalmarks);
		}
		public static void main(String[] args) {
		StudentResult ob=new StudentResult(23.4,22.7,24.5);
		}
}

	

