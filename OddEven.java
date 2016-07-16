import java.lang.*;
import java.util.*;

public class OddEven
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int x = Integer.parseInt(scanner.next());
		if(x>0)
		{
			System.out.println("Positive");
		}
		else if(x<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
		
	}
}