import java.util.Scanner;


public class FirstCharDigitorNot {

	public static void main(String[] args) {
		
		System.out.println("Enter the string to check : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		scanner.close();
		
		try {
			
			int x = Integer.parseInt(String.valueOf(string.trim().charAt(0)));
			if(x>=0&&x<=9)
			{
				System.out.println(true);
			}
			
		} catch (Exception e) {
			
			System.out.println(false);
			
		}
	}

}
