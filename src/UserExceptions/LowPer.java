package UserExceptions;

public class LowPer extends Exception {
	int per;
	
	public LowPer(int per) {
				this.per = per;
	}

	public String toString()
	{
		if(per>80)
		{
		System.out.println("\t\t\t\t\tYou Missed That Your Percentage Are Just Below Admiting Line To Get Admit In Our College"
			+"\n\t\t\t\t\tTry Next Round ");
		}
		if(per>70 & per<80)
		{
		System.out.println("\t\t\t\t\tYou Missed That Your Percentage Are Just Below Average Line To Get Admit In Our College"
			+"\n\t\t\t\t\tKeep Trying Next Round ");
		}
		else if(per<70)
		{
			System.out.println("\t\t\t\t\tYour Percentage Are Too Low To Get Admission You Cant Get Admit In Any Round");
		}
		return "\t\t\t\t\tPercentage Exception Occured";
	}
	

}
