public class stringinteger {

	public static void main(String[] args) {

		String str = ("500");
		try {
			int number = Integer.parseInt(str);
			System.out.println(number); // output = 25
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}

	}

}
