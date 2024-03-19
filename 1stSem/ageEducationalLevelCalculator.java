import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.*;

public class ageEducationalLevelCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Input
		System.out.print("Enter Date Today");
		System.out.println();
		System.out.print("Month [1-12] : ");
		int MM = in.nextInt();
		System.out.print("Day [1-31] : ");
		int dd = in.nextInt();
		System.out.print("Year : ");
		int yyyy = in.nextInt();
		System.out.println();
		System.out.print("Enter Your Birthdate");
		System.out.println();
		System.out.print("Month [1-12] : ");
		int MMb = in.nextInt();
		System.out.print("Day [1-31] : ");
		int ddB = in.nextInt();
		System.out.print("Year : ");
		int yyyyB = in.nextInt();
		System.out.println();

		// Process

		LocalDate nowDate = LocalDate.of(+yyyy, +MM, +dd);
		LocalDate secondDate = LocalDate.of(+yyyyB, +MMb, +ddB);

		// For days
		LocalDate thirdDate = LocalDate.of(+yyyy, +MM, 1);
		LocalDate fourthDate = LocalDate.of(+yyyyB, +MMb, 1);

		int yyyyfinal = (int) (ChronoUnit.YEARS.between(secondDate, nowDate));
		int MMsolution = (int) (ChronoUnit.MONTHS.between(secondDate, nowDate));
		int MMfinal = MMsolution - (yyyyfinal * 12);
		int daysA = (int) (ChronoUnit.DAYS.between(fourthDate, thirdDate));
		int daysB = (int) (ChronoUnit.DAYS.between(secondDate, nowDate));
		int ddfinal = daysB - daysA;

		// Final Output

		System.out.println(daysA + " " + daysB);
		System.out.printf("You are now %d years %d months and %d days old", yyyyfinal, MMfinal, ddfinal);
		System.out.println();
		System.out.print("Your educational level is ");

		if (yyyyfinal >= 1 && yyyyfinal <= 2) {
			System.out.print("Baby");
		}

		else if (yyyyfinal >= 2 && yyyyfinal <= 8) {
			System.out.print("Elementary");
		}

		else {
			System.out.print("You old");
		}

		in.close();
	}

}
