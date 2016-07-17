import java.util.Scanner;


public class EvenSquareOddCube {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements in array : ");
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.next());
		int[] array = new int[x];
		int sum = 0;
		
		for(int i=0;i<x;i++)
		{
			int temp = i+1;
			System.out.println("Enter the "+temp+" element : ");
			array[i] = Integer.parseInt(scanner.next());
			
		}
		scanner.close();
		
		for(int i=0;i<array.length;i++)
		{
			if((i+1)%2 == 0)
			{
				sum = sum +(int) Math.pow(array[i], 2);
			}
			else
			{
				sum = sum +(int) Math.pow(array[i], 3);
			}
		}
		
		System.out.println("Output : "+sum);
		
	}

}
