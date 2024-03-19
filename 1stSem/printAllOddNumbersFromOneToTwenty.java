import java.util.Scanner;

public class printAllOddNumbersFromOneToTwenty {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		{

			int start = 1;
			int n = 20;
			System.out.println();

			while (start <= n) {
				int ans = start % 2;
				if (ans != 0) {
					System.out.println(start + " ");
				}

				start++;

			}
			in.close();
		}
	}
}
