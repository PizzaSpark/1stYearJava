import java.util.Scanner;

public class printNtoM {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			System.out.println("First number: ");
			int n = in.nextInt();
			System.out.println("Second number: ");
			int m = in.nextInt();

			while (n <= m) {
				System.out.println(n);
				n++;
			}

			in.close();
		}
	}
}
