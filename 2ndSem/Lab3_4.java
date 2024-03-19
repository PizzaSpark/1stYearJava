import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab3_4 {

	public static void main(String[] args) {
		try {
			BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
			String menu;

			do {

				int[] score = new int[10];
				int ctr = 0;

				for (ctr = 0; ctr < score.length; ctr++) {
					System.out.print("Enter number " + (ctr + 1) + ": ");
					score[ctr] = Integer.parseInt(datain.readLine());
				}

				System.out.print("The numbers are: ");
				for (ctr = score.length - 1; ctr >= 0; ctr--) {
					System.out.print(score[ctr] + " ");
				}

				System.out.println();
				System.out.println();
				System.out.print("Try again Y/N?: ");
				menu = datain.readLine();
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));

		}

		catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
