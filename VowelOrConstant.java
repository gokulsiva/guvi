import java.util.Scanner;


public class VowelOrConstant {

	public static void main(String[] args) {
		
		System.out.println("Enter a alphabetic character : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char character = string.charAt(0);
		scanner.close();
		
		if(character == 'a' ||character == 'e' ||character == 'i' ||character == 'o' ||character == 'u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}

	}

}
