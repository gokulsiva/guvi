import java.util.Scanner;


public class ExtensionFinder {

	public static void main(String[] args) {
		
		System.out.println("Enter the file to find extension : ");
		Scanner scanner = new Scanner(System.in);
		String file = scanner.next();
		scanner.close();
		String[] array = file.split("\\.");
		System.out.println("The extension of file is = "+array[1]);

	}

}
