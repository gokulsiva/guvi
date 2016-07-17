import java.util.Scanner;


public class Power {

	public static void main(String[] args) {
		
		System.out.println("Enter a integer whose power to be find : ");
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.next());
		System.out.println("Enter power to be raised : ");
		int y = Integer.parseInt(scanner.next());
		scanner.close();
		System.out.println("Output : "+(int)Math.pow(x,y));

	}

}
