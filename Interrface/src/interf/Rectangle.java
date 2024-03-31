package interf;

public interface Rectangle 
    {
	void AreaR(int l,int w);
	}
	interface Circleln
	{
	void AreaC(int radius);
	}

	class AreaCal implements  Rectangle, Circleln
		{
			public void AreaR(int l,int w)
			{
				int area=l*w;
				System.out.println("area of rectangle is.."+area);
			}
			public void AreaC(int radius) 
			{
				double area=3.1415*radius*radius;
				System.out.println("area of circle is.."+area);
			}
		
	public static void main(String[] args)
	{
		{
			AreaCal ob = new AreaCal();
			ob.AreaR(4,5);
			ob.AreaC(5);
		}
	}
	}


