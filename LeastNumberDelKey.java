import java.util.Arrays;
import java.util.Scanner;


public class LeastNumberDelKey {

	public static void main(String[] args) {
		
		System.out.println("Enter a value whose least number is to found : ");		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println("Enter the number of digits to be deleted : ");
		int key = Integer.parseInt(scanner.next());
		scanner.close();
		
		String[] array = input.split("");
		int[] arrayInt = new int[array.length]; 
		for(int i = 0;i<array.length;i++)
		{
			arrayInt[i] = Integer.parseInt(array[i]);
		}
		
		Arrays.sort(arrayInt);
		
		if(key>arrayInt.length)
		{
			System.out.println("Please enter a value less than length of number");
		}
		else if(key>arrayInt.length)
		{
			System.out.println("All numbers are deleted");
		}
		else if((key<arrayInt.length)&&(arrayInt.length>=0))
		{
			System.out.print("Least number is = ");
			for(int i=0;i<arrayInt.length-key;i++)
			{
				System.out.print(arrayInt[i]);
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
		

	}

}
