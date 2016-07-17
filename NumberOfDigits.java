import java.util.Scanner;


public class NumberOfDigits {

	public static void main(String[] args) {
		

		System.out.println("Enter the integer to check : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		scanner.close();
		System.out.println("The number of digits is = "+string.length());

	}

}
