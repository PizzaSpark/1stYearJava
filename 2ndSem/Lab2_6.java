public class Lab2_6 {

	public static void main(String[] args) {

		try {

			int num = 0;
			num = 1;
			while (num <= 10) {

				System.out.println(num);

				if (num == 5) {
					continue;
				}
				num = num + 1;

			}

			System.out.println("Thank you.");

		} catch (Exception e) {
			System.out.println("Error Exception");
		}
	}
}
