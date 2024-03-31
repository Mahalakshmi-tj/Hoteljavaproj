package bookings;
import java.util.Scanner;

public class UserSelection {
	public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	
	 System.out.println("1.Registraion  2.Booking  3.Check Status   " 
			  + "4.Email  5.All Bookings   6.All customers  7.Quit"); 
			 System.out.println("Enter an option"); 
			 int option=s.nextInt(); 
			 switch(option){ 
			 case 1: 
			 register(); 
			 break; 
			 case 2: 
			 booking(); 
			 break; 
			 case 3: 
			status(); 
			break; 
			 case 4: 
			 updateEmail(); 
			 break; 
			 case 5: 
			 bookings(); 
			 break; 
			 case 6: 
			 allCustomer(); 
			 break; 
			 case 7: 
			 exitFromApp(); 
			 break; 
			 default: 
			 System.out.println("Choose correct option"); 
			 break; 

	
	
	}
	
}
	public static void register(){ 
		 Scanner s = new Scanner(System.in); 
		 System.out.println("Do you want to proceed to registration"); 
		 System.out.println("Enter YES or NO"); 
		 String entry=s.nextLine(); 
		 if(entry.equals("YES")){ 
		 System.out.println("Enter Name"); 
		 String iname=s.nextLine(); 
		 System.out.println("Enter contact number"); 
		 int icontact=s.nextInt(); 
		System.out.println("The guest with name "+iname +" and contact number "+icontact+" has been successfully registered. Thank you"); 
		} 
		 else if(entry.equals("NO")){ 
		 System.out.println("Exit"); 
		 } 
		 else { 
		 System.out.println("Enter correct option"); 
		 } 
		} 
		public static void booking(){ 
		Scanner s = new Scanner(System.in); 
		System.out.println("Select 1.AC  2.NON AC"); 
		int iroomType=s.nextInt(); 
		   if( iroomType==1){ 
		   System.out.println("cost=2000"); 
		   } 
		   if ( iroomType==2){ 
		   System.out.println("cost=1000"); 
		   } 
		System.out.println("Select 1.CONFIRM 2.CANCEL"); 
		int op=s.nextInt(); 
		confirmation(op); 
		   } 
		public static void confirmation(int con){ 
		  if(con==1){ 
		  System.out.println("Booking confirmed."); 
		  } 
		  else if(con==2){ 
		  System.out.println("Booking cancelled."); 
		} 
		  else  
		  System.out.println("Choose correct option."); 
		} 
		   public static void status(){ 
		   Scanner s = new Scanner(System.in); 
		   System.out.println("Enter the date"); 
		int idate=s.nextInt(); 
		System.out.println("Select RoomNo    Rooms:1,2,3,... 45"); 
		int iroom=s.nextInt(); 
		   if(idate>3 && idate<10 ){ 
		   if(iroom>0 && iroom<20){ 
		   System.out.println("Booked."); 
		   } 
		   else if(iroom>=20 && iroom<=45){ 
		   System.out.println("Vacant."); 
		   } 
		   else 
		   { 
		   System.out.println("Enter correct room no."); 
		   } 
		   } 
		   else{  
		   if(iroom>0 && iroom<=45){ 
		      System.out.println("Vacant."); 
		      } 
		   else 
		   System.out.println("Enter correct room no"); 
		   } 
		   } 
		   public static void updateEmail(){ 
		   Scanner s = new Scanner(System.in); 
		   System.out.println("Enter your new email"); 
		String iemail=s.nextLine(); 
		   System.out.println("The email "+iemail+" has been successfully updated."); 
		   } 
		   public static void bookings(){ 
		   Scanner s = new Scanner(System.in); 
		   System.out.println("Select day 1.Monday 2.Tuesday 3.Wednesday" 
		   + "  4.Thursday  5.Friday  6.Saturday 7.Sunday"); 
		int iday=s.nextInt(); 
		   if(iday==1 || iday==5 || iday==7){ 
		   System.out.println("4 rooms have been booked & 10 rooms are vacant."); 
		   } 
		   else if(iday==2 ||iday==3 ||iday==4 ||iday==6){ 
		   System.out.println("6 rooms have been booked & 8 rooms are vacant."); 
		   } 
		   else 
		   System.out.println("Enter the correct option"); 
		   } 
		   public static void allCustomer(){ 
		   Scanner s = new Scanner(System.in); 
		   System.out.println("Name :     Contact No:  "); 
		   } 
		   public static void exitFromApp(){ 
		   Scanner s = new Scanner(System.in); 
		   System.out.println("Select  1.EXIT "); 
		int ichoice=s.nextInt(); 
		   if (ichoice==1){ 
		   System.out.println("Successfully exited the app."); 
		   } 
		   else  
		   System.out.println("failed"); 
		   }  
		} 
		  


