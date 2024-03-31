package interf;

	interface AnimalTwo 
	{
	    int iCowCost=8000;
	    int iGoatCost=5000;
	    final int BASE_PRICE=2000;
	    public void eat();
	    public void walk();
	}
	
	class Animall implements AnimalTwo{
		public void eat()
		{
		System.out.println("Animal can eat..");
		}
		public void walk()
		{
		System.out.println("Animal can walk..");
		}
	    
	public static void main(String ar[])
	{
		Animall ob = new Animall();
	    ob.eat();
	    ob.walk();
	    System.out.println("Base price is"+" "+BASE_PRICE);
	    System.out.println("cost of cow is"+" "+iCowCost);
	    System.out.println("cost of goat is"+" "+iGoatCost);
	}
	}


