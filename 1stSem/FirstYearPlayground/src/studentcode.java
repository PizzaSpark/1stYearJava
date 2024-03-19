import java.util.Scanner;

public class studentcode {

	public static void main(String[] args) {

		try {

			Scanner in = new Scanner(System.in);
			int studentcount = 0;
			String menu;
			do {

				System.out.print("Enter Name: ");
				String name = in.nextLine();

				System.out.println();
				System.out.println("IT :1   Computer Engineering:2   Death:3");
				System.out.print("Enter Course (enter number based from above): ");
				int course = in.nextInt();

				System.out.println();
				System.out.print("Enter Year (first enrolled): ");
				int year = in.nextInt();

				studentcount = studentcount + 1;

				if (course < 10) {
					if (studentcount < 10) {
						System.out.print("Your student code: " + year + "00" + course + "00" + studentcount);
					}

					else if (studentcount < 100) {
						System.out.print("Your student code: " + year + "00" + course + "0" + studentcount);
					}

				}

				else if (course < 100) {
					if (studentcount < 10) {
						System.out.print("Your student code: " + year + "0" + course + "00" + studentcount);
					}

					else if (studentcount < 100) {
						System.out.print("Your student code: " + year + "0" + course + "0" + studentcount);
					}
				}

				System.out.println();
				System.out.println();
				System.out.print("Another Student?[Y/N]: ");
				menu = in.next();
				System.out.println();

			} while (menu.equalsIgnoreCase("Y"));
			in.close();
		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
