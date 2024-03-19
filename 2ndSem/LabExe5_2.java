import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LabExe5_2 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;

			do {

				int[] arr = new int[10];
				int ctr = 0;

				System.out.print("Enter the numbers: ");

				String line = in.readLine();
				String[] strs = line.trim().split("\\s+");
				for (int i = 0; i < 10; i++) {
					arr[i] = Integer.parseInt(strs[i]);
				}

				for (int a = 0; a < arr.length; a++) {

					// checking if they are 0-99
					if (arr[a] < 0 || arr[a] > 100) {

						System.out.println("Number outside the values 0-99 is detected! ");
						System.out.println("Please try again!");
						ctr = ctr + 1;
						break;
					}
					// checking if it already checked the last integer
					else if (arr.length - 1 == a) {
						// sorting
						Arrays.sort(arr);
						// printing
						System.out.print("Ascending: ");

						for (int i = 0; i < arr.length; i++) {
							System.out.print(arr[i] + " ");
						}
						System.out.println();
						System.out.print("Descending: ");

						for (int i = arr.length - 1; i >= 0; i--) {
							System.out.print(arr[i] + " ");
						}
					}

				}

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
