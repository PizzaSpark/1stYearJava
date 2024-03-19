import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CaseStudy5_2 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;

			System.out.println("Made by Sean Godric Reyes & Kyle Jay Tuazon");
			System.out.println();
			do {

				System.out.print("How many numbers?: ");
				int ctr = Integer.parseInt(in.readLine());

				int[] arr = new int[ctr];

				System.out.print("Input numbers: ");
				String line = in.readLine();
				String[] strs = line.trim().split("\\s+");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = Integer.parseInt(strs[i]);
				}

				// sorting
				Arrays.sort(arr);
				// printing
				System.out.println("Sum of the two largest values: " + ((arr[ctr - 1]) + arr[ctr - 2]));

				System.out.println();
				System.out.println();
				System.out.print("Try again Y/N?: ");
				menu = in.readLine();
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));

		}

		catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
