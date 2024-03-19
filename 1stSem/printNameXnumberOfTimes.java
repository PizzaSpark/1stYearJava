import java.util.Scanner;
public class printNameXnumberOfTimes
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		{
			
			System.out.println("Enter name: ");
			String name = in.nextLine();
			
			System.out.println("Enter how many times to repeat: ");
			int number = in.nextInt();
			
			for (int count = 1; count <= number; count++)
			{
		        System.out.println(name);
			}
		    
	        in.close();
		}	
	}	
}
