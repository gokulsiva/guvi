import java.util.Scanner;
import java.lang.*;
class countWords
{

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
 		System.out.println("Enter a string : ");
		String string = new String(scanner.nextLine());
		String[] array = string.split("\\s");
		System.out.println("Number of words in the string is "+array.length);

		
	}
}