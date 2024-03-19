import java.util.Scanner;

public class sumOfAllBetweenTwoNumbers {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String menu;

			do {

				int num = 0;
				int sum = 0;

				System.out.print("Enter the value of n: ");
				num = in.nextInt();
				System.out.print("Enter the value of m: ");
				int m = in.nextInt();

				while (num <= m) {
					sum = sum + num;
					num = num + 1;
					if (num > m) {
						System.out.println("The sum is " + sum);
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
		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
