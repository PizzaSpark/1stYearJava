import java.util.Scanner;

public class averageOfTenIntegerInputs {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{
			double total = 0;

			System.out.println("Enter 10 Integers: ");

			for (int count = 1; count <= 10; count++) {
				int number = in.nextInt();
				total = total + number;
			}

			double average = total / 10;
			System.out.println("Average is: " + average);

			in.close();
		}
	}
}
