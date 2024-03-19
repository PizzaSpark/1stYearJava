public class array {

	public static void main(String[] args) {

		int[][] integers = { { 42, 24, 45, 25 }, { 69, 55, 14, 21 } };
		// ROWS
		// print first row
		System.out.print(integers[0][0] + " ");
		System.out.print(integers[0][1] + " ");
		System.out.print(integers[0][2] + " ");
		System.out.print(integers[0][3] + " ");

		// print second row
		System.out.println();
		System.out.print(integers[1][0] + " ");
		System.out.print(integers[1][1] + " ");
		System.out.print(integers[1][2] + " ");
		System.out.print(integers[1][3] + " ");

		// print loop
		System.out.println();
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 4; j++)
				System.out.print(integers[i][j] + " ");

	}

}
