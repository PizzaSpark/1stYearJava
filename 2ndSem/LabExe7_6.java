import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe7_6 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;
			int num = 1;
			;
			do {

				System.out.println("Sample Run " + num);
				System.out.print("Enter sentence: ");
				String name = in.readLine();

				name = name.toUpperCase();

				name = name.replaceAll("[AEIAO]", "");
				System.out.println(name);

				System.out.println();
				System.out.print("Try again? [Y/N] : ");
				menu = in.readLine();
				System.out.println();
				num++;
			}

			while (menu.equalsIgnoreCase("Y"));

		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
