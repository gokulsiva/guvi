import java.util.Scanner;


public class AlphabetOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter a alphabetic character : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		scanner.close();
		int character = (int)string.charAt(0);
		if((character>=65&&character<=90)||(character>=97&&character<=122))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not a alphabet");
		}

	}

}
