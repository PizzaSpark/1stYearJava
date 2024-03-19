import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String menu;

			do {

				int num = 0;

				System.out.print("Enter diameter: ");
				num = in.nextInt();
				System.out.println();

				double radius = num / 2;
				System.out.println("Radius = " + radius);

				Double area = Math.PI * radius * radius;
				System.out.println("Area = " + area);

				Double circumference = 2 * Math.PI * radius;
				System.out.println("Circumference = " + circumference);

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
