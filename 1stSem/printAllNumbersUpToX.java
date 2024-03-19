import java.util.Scanner;

public class printAllNumbersUpToX {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			System.out.println("Enter number: ");
			int n = in.nextInt();

			int count = 1;

			while (count <= n) {
				System.out.println(count);
				count++;
			}

			in.close();
		}
	}
}
