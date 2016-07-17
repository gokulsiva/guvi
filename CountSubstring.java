import java.util.Scanner;


public class CountSubstring {

	public static void main(String[] args) {
		
		System.out.println("Enter the string to check : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		scanner.close();
		String[] array = string.split(" ");
		System.out.println("Number of substrings = "+array.length);

	}

}
