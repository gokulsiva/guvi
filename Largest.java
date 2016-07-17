import java.util.Scanner;


public class Largest {

	public static void main(String[] args) {
		

		int[] array = new int[3];
		
		Scanner scanner = new Scanner(System.in);
				
		for(int i=0;i<3;i++)
		{
			int temp = i+1;
			System.out.println("Enter the "+temp+" element : ");
			array[i] = Integer.parseInt(scanner.next());
			
		}
		scanner.close();
		
		if((array[0]>array[1])&&(array[0]>array[2]))
		{
			System.out.println(array[0]+" is greater among three");
		}
		else if(array[1]>array[2])
		{
			System.out.println(array[1]+" is greater among three");
		}
		else
		{
			System.out.println(array[2]+" is greater among three");
		}

	}

}
