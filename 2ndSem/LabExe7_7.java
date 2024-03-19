import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe7_7 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;
			int num = 1;
			;
			do {

				System.out.println("Sample Run " + num);
				System.out.print("Enter word or phrase: ");
				String str = in.readLine();

				System.out.print("Enter letter to ignore: ");
				String letter = in.readLine();

				String lettersmol = letter.toLowerCase();
				String letterbig = letter.toUpperCase();

				str = str.replaceAll(lettersmol, "");
				str = str.replaceAll(letterbig, "");
				System.out.println(str);

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
