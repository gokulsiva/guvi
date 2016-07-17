
public class LeapYear {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		if(x%400==0||(x%100!=0&&x%4==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		

	}

}
