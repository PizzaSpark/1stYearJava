import java.util.Scanner;

public class investmentCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			System.out.print("Enter Initial Investment: ");
			int principal = in.nextInt();

			System.out.print("Enter rate: ");
			double rate = in.nextInt();

			System.out.print("Enter time: ");
			double time = in.nextInt();

			double rateF = rate / 100;
			double tempb = 1 + rateF / time;
			double tempc = Math.pow(tempb, time);
			double investment = principal * tempc;
			double investmentRounded = Math.round(investment * 100.0) / 100.0;

			System.out.println("Amount of investment: " + investmentRounded);

			in.close();

		}
	}
}
