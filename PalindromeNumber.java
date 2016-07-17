
public class PalindromeNumber {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer(args[0]);
		if(buffer.equals(buffer.reverse()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
