import java.util.Scanner;
public class yumm {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in) ;
			
			System.out.print("Enter a number: ");
			int num=sc.nextInt();
			if ( num < 100 )

			{
			System.out.println("The entered number is less than 100");
			}
			else if (num > 50)

			{
			System.out.println("The entered number is greater than 50"); }

			else {
			System.out.println("The entered number is greater tHan 100");
			}
		        sc.close();

		}
	}

