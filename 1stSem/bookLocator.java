import java.util.Scanner;

public class bookLocator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			System.out.print("Enter Book Call Number: ");
			int number = in.nextInt();

			if (number >= 100 && number <= 199) {
				System.out.print("Basement");
			}

			else if (number >= 200 && number <= 500 || number > 900) {
				System.out.print("Main Floor");
			}

			else if (number >= 501 && number <= 900) {
				if (number >= 700 && number <= 750) {
					System.out.print("Archives");
				} else {
					System.out.print("Upper Floor");
				}
			}

			in.close();

		}
	}
}
