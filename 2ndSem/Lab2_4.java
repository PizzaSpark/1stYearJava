import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {

		try {

			Scanner in = new Scanner(System.in);
			int ran = (int) (Math.random() * 100);

			do {

				System.out.print("Enter your guess number: ");
				int num = in.nextInt();

				if (num < ran) {
					System.out.println("Your guess is lower than the number. Guess again!");
				}

				else if (num > ran) {
					System.out.println("Your guess is higher than the number. Guess again!");
				}

				else if (num == ran) {
					System.out
							.println("You guessed the correct number! Just to confirm, the correct answer was " + ran);
					break;
				}

			}

			while (true);
			in.close();

		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
