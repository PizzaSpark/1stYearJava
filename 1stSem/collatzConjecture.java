import java.util.Scanner;

public class collatzConjecture {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String menu;

			do {

				int num = 0;

				System.out.print("Enter positive integer: ");
				num = in.nextInt();
				System.out.println();

				while (num != 1 & num > 0) {
					if (num % 2 == 0) {
						num = num / 2;
						System.out.print(num + " ");
					} else if ((num % 2) != 0) {
						num = 3 * num + 1;
						System.out.print(num + " ");
					}
				}

				System.out.println();
				System.out.println();
				System.out.print("Try again Y/N?: ");
				menu = in.next();
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));
			in.close();

		}

		catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
