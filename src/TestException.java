import UserExceptions.*;
import java.util.Scanner;

import UserExceptions.InvalidAge;
import UserExceptions.LowPer;

public class TestException {
	static Scanner  sc= new Scanner(System.in);
	public static void main(String[] args) {
		   System.out.println("\n\n\t\t\t\t ----------------------------------------------------");
		   System.out.println("\t\t\t\t-||                                                  ||-");
		   System.out.println("\t\t\t\t-||      Welcome To College Of Engineering Pune      ||-");
		   System.out.println("\t\t\t\t-||                                                  ||-");
		   System.out.println("\t\t\t\t ----------------------------------------------------");
		   System.out.println("\n\n\t\t\t\t******** Enter Students Details!!! **********");
		   int i=101;
		   int studId=i;
		   String studName;
		   long studPhone;
		   int studAge;
		   int studPer;
		   try {
		   System.out.print("\n\t\t\t\t\t * Enter Full Name :- ");
		   studName=sc.nextLine();
		   System.out.print("\t\t\t\t\t * Enter Phone Number :-");
		   studPhone=sc.nextLong();
		   System.out.print("\t\t\t\t\t * Enter Age :-");
		   studAge=sc.nextInt();
		   if(studAge<18)
		   {
			   throw new InvalidAge();
		   }
		   else
				   {
						  System.out.print("\t\t\t\t\t * Enter Percentage :-");
						  studPer=sc.nextInt();
						   if(studPer<89)
						   {
							   throw new LowPer(studPer);
						   }
				   }
		   System.out.println("\t\t\t\t------------ Admitted Successfully -----------------");
		System.out.println("\t\t\t\t Welcome To College Of Engineering, Pune!!!");
		   //try block End 
		   }
		   catch(InvalidAge|LowPer e) 
		   {
			   System.out.println(e);
		   }
		   catch(Exception e)
		   {
			   System.out.println("\t\t\t\t\t Unknown Exception Occured!!!");
		   }
		   
		   finally {
			   System.out.println("\n\n\t\t\t\t ----------------------------------------------------");
			   System.out.println("\t\t\t\t-||                                                  ||-");
			   System.out.println("\t\t\t\t-||            ✨💥 ThankYou!!Visit Again!!!💥✨             ||-");
			   System.out.println("\t\t\t\t-||               😃   Made By Anirudha 😃                               ||-");
			   System.out.println("\t\t\t\t-||                                                  ||-");
			   System.out.println("\t\t\t\t ----------------------------------------------------");
			   
		}
	}

}
