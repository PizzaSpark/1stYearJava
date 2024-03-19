import java.util.Scanner;

public class printAllOddNumbersFromInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String menu;

		do {
			int start = 1;
			int n = 0;
			System.out.print("Enter the value of n: ");
			n = input.nextInt();
			System.out.println();

			while (start <= n) {
				int ans = start % 2;
				if (ans != 0) {
					System.out.print(start + " ");
				}

				start++;
			}

			System.out.println();
			System.out.println();
			System.out.print("Try again Y/N?: ");
			menu = input.next();
		}

		while (menu.equalsIgnoreCase("Y"));
		input.close();

	}
}
