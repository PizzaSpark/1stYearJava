import java.util.Scanner;

public class oddEvenChecker {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String menu;

			do {

				int num = 0;

				System.out.print("Enter number: ");
				num = in.nextInt();

				while (num != 0) {
					if (num % 2 == 0) {
						System.out.println("Even");
					} else if ((num % 2) != 0) {
						System.out.println("Odd");
					}
					num = 0;
				}

				System.out.println();
				System.out.println();
				System.out.print("Try again Y/N?: ");
				menu = in.next();
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));
			in.close();
		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
