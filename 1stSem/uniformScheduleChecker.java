import java.util.Scanner;

public class uniformScheduleChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter day: ");
		String day = in.nextLine();

		String dayy = day.toLowerCase();

		switch (dayy) {

			case "wednesday":
				System.out.print("Today is Dressdown day.");
				break;

			case "monday":
			case "tuesday":
			case "thursday":
			case "friday":
				System.out.print("Today is Uniform day.");
				break;

			default:
				System.out.print("Input is unclear or what you inputted is not a school day.");
				break;
		}

		in.close();
	}
}
