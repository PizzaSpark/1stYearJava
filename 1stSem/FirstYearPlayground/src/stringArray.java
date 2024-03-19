public class stringArray {

	public static void main(String[] args) {

		String[][] names = {
				{ "Sean", "Kyle", "Aubreigh", "Hanamitchie" },
				{ "Camille", "Cody", "Ligma", "Yagoo" }
		};

		// print first column
		System.out.print(names[0][0] + " ");
		System.out.print(names[1][0] + " ");

		// print second column
		System.out.println();
		System.out.print(names[0][1] + " ");
		System.out.print(names[1][1] + " ");

		// print third column
		System.out.println();
		System.out.print(names[0][2] + " ");
		System.out.print(names[1][2] + " ");

		// print fourth column
		System.out.println();
		System.out.print(names[0][3] + " ");
		System.out.print(names[1][3] + " ");

		// print loop
		System.out.println();
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 2; j++)
				System.out.print(names[j][i] + " ");

	}

}
