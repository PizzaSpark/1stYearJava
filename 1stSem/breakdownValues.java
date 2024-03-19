import java.util.Scanner;
public class breakdownValues {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int number, thousand, fivehundred, onehundred, fifty, twenty, ten, five, one;
				
			System.out.print("Write number: ");
			number = input.nextInt();
			thousand = number / 1000;
			System.out.println("1000 - "+thousand);
			fivehundred = (number - (1000 * thousand)) / 500;
			System.out.println("500 - "+fivehundred);
			onehundred = (number - (1000 * thousand) - (500 * fivehundred)) /100;
			System.out.println("100 - "+onehundred);
			fifty = (number - (1000 * thousand) - (500 * fivehundred) - (100 * onehundred)) / 50;
			System.out.println("50 - "+fifty);
			twenty = (number - (1000 * thousand) - (500 * fivehundred) - (100 * onehundred) - (50 * fifty)) / 20;
			System.out.println("20 - "+twenty);
			ten = (number - (1000 * thousand) - (500 * fivehundred) - (100 * onehundred) - (50 * fifty) - (20 * twenty)) / 10;
			System.out.println("10 - "+ten);
			five = (number - (1000 * thousand) - (500 * fivehundred) - (100 * onehundred) - (50 * fifty) - (20 * twenty) - (10 * ten)) /5;
			System.out.println("5 - "+five);
			one = (number - (1000 * thousand) - (500 * fivehundred) - (100 * onehundred) - (50 * fifty) - (20 * twenty) - (10 * ten) - (5 * five)) /1;
			System.out.println("1 - "+one);
		

			// B E T T E R    W A Y    I N   D O I N G   I T

			// int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 1};
            // int number;

            // System.out.print("Write number: ");
            // number = input.nextInt();

            // for (int denomination : denominations) {
            //     int count = number / denomination;
            //     number %= denomination;
            //     System.out.println(denomination + " - " + count);
            // }
		}		
	}
}
