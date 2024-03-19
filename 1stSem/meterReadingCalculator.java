import java.util.Scanner;

public class meterReadingCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			System.out.print("Enter Meter Reading: ");
			int number = in.nextInt();

			if (number >= 0 && number <= 500) {
				System.out.println("Total Charge/Cost is: 10");
			}

			else if (number >= 501 && number <= 1000) {
				double temp = number - 500;
				double tempb = temp * (0.05);
				double cost = 10 + tempb;

				System.out.println("Total Charge/Cost is: " + cost);
			}

			else if (number < 1000) {
				double tempc = number - 1000;
				double tempd = tempc * (0.03);
				double costb = 35 + tempd;

				System.out.println("Total Charge/Cost is: " + costb);
			}

			in.close();

		}
	}
}
