import java.util.Scanner; 
import java.time.*;
public class bday {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// Input
		System.out.print("Enter Your Birthdate");
		System.out.println();
		System.out.print("Month [1-12] : ");
		int month = in.nextInt();
		System.out.print("Day [1-31] : ");
		int day = in.nextInt();
		System.out.print("Year : ");
		int year = in.nextInt();
		System.out.println();
		
		
		// Process

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		
		Period period = Period.between(birthday, today);
			
		int finalMonths = period.getMonths();
		int finalDay = period.getDays();
		int finalYear = period.getYears();
		
		
		// Final Output
		
		System.out.print(finalYear+" years "+finalMonths+" months "+finalDay+" days");
		
		
		in.close();
	}

}
