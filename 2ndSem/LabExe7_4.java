import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe7_4 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;
			int num = 1;
			;
			do {

				String nstr = "";
				char ch;
				System.out.println("Sample Run " + num);
				System.out.print("Enter name: ");
				String name = in.readLine();

				for (int i = 0; i < name.length(); i++) {
					ch = name.charAt(i); // extracts each character
					nstr = ch + nstr; // adds each character in front of the existing string
				}

				System.out.println(nstr);

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
