public class Lab2_5 {

	public static void main(String[] args) {

		try {

			int num = 0;
			num = 1;
			while (num <= 10) {

				System.out.println(num);
				num = num + 1;

				if (num == 5) {
					break;
				}

			}

			System.out.println("Thank you.");

		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}
