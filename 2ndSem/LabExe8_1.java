public class LabExe8_1 {
	public static void main(String[] args) {
		int sum = getSum(10, 12);
		printResult(sum);
		println("This message is in a different line. ");
		print("While, this message is not. ");
		printMessage();
	}

	public static int getSum(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

	public static void printResult(int result) {
		System.out.println("The result is " + result);
	}

	public static void println(String message) {
		System.out.print(message);
	}

	public static void print(String message) {
		System.out.print(message);
	}

	public static void printMessage() {
		System.out.println("Hi! Good Morning.");
	}
}
