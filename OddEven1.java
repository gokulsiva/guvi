import java.lang.*;
import java.util.*;

public class OddEven1
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int x = Integer.parseInt(scanner.next());
		if(x%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}
}