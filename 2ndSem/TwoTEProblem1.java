import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoTEProblem1 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;
			do {
				String[] name = new String[5];
				int[] votes = new int[5];
				double[] score = new double[5];
				int total = 0;

				System.out.println("Please enter 5 candidates:");
				for (int i = 0; i < name.length; i++) {
					name[i] = in.readLine();
				}

				System.out.println();
				System.out.println("Please enter votes received by each candidates:");
				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + " - ");
					votes[i] = Integer.parseInt(in.readLine());
				}

				for (int i = 0; i < name.length; i++) {
					total = total + votes[i];
				}

				for (int i = 0; i < name.length; i++) {
					score[i] = (votes[i] / (double) total) * (double) 100;
				}

				System.out.println();
				System.out.println("Candidate		Votes Received		% of Total Votes");
				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + "			" + votes[i] + "			");
					System.out.printf("%.2f", score[i]);
					System.out.println();
				}
				System.out.println();
				System.out.println("Total" + "			" + total);
				System.out.println("The Winner of the election is ");

				System.out.println();
				System.out.print("Try again [Y/N]: ");
				menu = in.readLine();
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));

		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}