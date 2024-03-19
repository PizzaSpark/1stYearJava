import java.util.Scanner;

public class printNameTenTimes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			System.out.println("Enter name: ");
			String name = in.nextLine();

			for (int count = 1; count <= 10; count++) {
				System.out.println(name);
			}

			in.close();
		}
	}
}
