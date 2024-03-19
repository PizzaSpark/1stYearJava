import java.util.Scanner;

public class FTEProblem1 {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String menu;

			do {

				int num = 0;
				int numm = 0;
				int hcf = 0;
				System.out.print("Enter first number: ");
				num = in.nextInt();
				System.out.print("Enter second number: ");
				numm = in.nextInt();
				System.out.println();

				System.out.print(+num + " ");
				System.out.print(+numm + " ");

				while (num > 0) {
					hcf = num - numm;
					hcf = Math.abs(hcf);
					System.out.print(+hcf + " ");
					if (hcf == 0) {
						break;
					}
					num = numm;
					numm = hcf;

				}
				System.out.println();
				System.out.println();
				System.out.println("The Highest Common Factor is: " + numm);
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
