import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe6_1 {
	public static void main(String[] args) {
		BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
		try {
			// declaring two dimensional and instantiation
			int[][] score = new int[4][3];
			int row = 0, col = 0;
			// input the elements of two dimensional array
			for (row = 0; row < 4; row++) {
				for (col = 0; col < 3; col++) {
					System.out.print("Enter value for row " + (row + 1) + " - column " + (col + 1) + ": ");
					score[row][col] = Integer.parseInt(datain.readLine());
				}
			}
			// display the elements of two dimensional array
			System.out.println("The elements of the two dimensional:");
			for (row = 0; row < 4; row++) {
				for (col = 0; col < 3; col++) {
					System.out.print(score[row][col] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Error encountered");
		}
	}
}