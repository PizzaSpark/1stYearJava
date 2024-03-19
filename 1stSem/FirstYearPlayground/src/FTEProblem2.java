import java.util.Scanner;
public class FTEProblem2
{
	
	
	public static void main(String[] args) 
	{
		try
        {
		Scanner in = new Scanner(System.in);
		String menu;
		
			do 
			{
				System.out.print("Enter first number: ");
				int num = in.nextInt();
				System.out.println();
				
				
				for (int i = 1; i <= num; i++) {

					for (int j = i; j < num; j++) {

						System.out.print("   ");
					}

					for (int k = 1; k < (i * 2); k++) {
						System.out.print(" * ");
					}

					System.out.println();
					System.out.println();
				}
			
				System.out.println();
				System.out.println();
				System.out.print("Try again [Y/N]?: ");
				menu = in.next();	
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));
			in.close();
			
        }
		
		catch (Exception e) 
		{
            System.out.println("Error Exception");
        }
		
	}
}

