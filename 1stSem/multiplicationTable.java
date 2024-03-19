import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = in.nextInt();

		System.out.println();

		int one = number;
		int two = number * 2;
		int three = number * 3;
		int four = number * 4;
		int five = number * 5;
		int six = number * 6;
		int seven = number * 7;
		int eight = number * 8;
		int nine = number * 9;
		int ten = number * 10;

		System.out.println("1 times " + number + " = " + one);
		System.out.println("2 times " + number + " = " + two);
		System.out.println("3 times " + number + " = " + three);
		System.out.println("4 times " + number + " = " + four);
		System.out.println("5 times " + number + " = " + five);
		System.out.println("6 times " + number + " = " + six);
		System.out.println("7 times " + number + " = " + seven);
		System.out.println("8 times " + number + " = " + eight);
		System.out.println("9 times " + number + " = " + nine);
		System.out.println("10 times " + number + " = " + ten);

		in.close();
	}
}