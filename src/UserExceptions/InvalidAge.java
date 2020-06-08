package UserExceptions;

public class InvalidAge extends Exception{
	
	public String toString()
	{
		System.out.println("\t\t\t\t\tYour Age Is To Small To Get Admit In Our College");
		return "\t\t\t\t\tAge Exception Occured";
	}
}
