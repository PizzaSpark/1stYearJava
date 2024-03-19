import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe6_2 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {

			int[][] twodarr = new int[3][3];
			int row = 0, col = 0;

			for (row = 0; row < 3; row++) {
				for (col = 0; col < 3; col++) {
					System.out.print("Enter grade of Student " + (row + 1) + " for Term " + (col + 1) + ": ");
					twodarr[row][col] = Integer.parseInt(in.readLine());
				}
			}

			int sum1 = (twodarr[0][0]) + (twodarr[0][1]) + (twodarr[0][2]);
			double average1 = sum1 / 3;
			int sum2 = (twodarr[1][0]) + (twodarr[1][1]) + (twodarr[1][2]);
			double average2 = sum2 / 3;
			int sum3 = (twodarr[2][0]) + (twodarr[2][1]) + (twodarr[2][2]);
			double average3 = sum3 / 3;

			System.out.println();
			System.out.println("        	[1]	[2]	[3]	[Average]");
			System.out.print("Tom, Mcky	");

			for (int i = 0; i < 3; i++) {
				System.out.print(twodarr[0][i] + "	");
			}

			System.out.print(average1);

			System.out.println();
			System.out.print("Tom, Mcdher	");

			for (int i = 0; i < 3; i++) {
				System.out.print(twodarr[1][i] + "	");
			}

			System.out.print(average2);

			System.out.println();
			System.out.print("Chiz, Moza	");

			for (int i = 0; i < 3; i++) {
				System.out.print(twodarr[2][i] + "	");
			}

			System.out.print(average3);

		} catch (Exception e) {
			System.out.println("Error encountered");
		}
	}
}