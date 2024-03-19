import java.util.Scanner;
public class stringtest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
			System.out.println("ABOUT ME");
			System.out.println();
			System.out.println("First Name: ");
			String first = in.nextLine();
			
			System.out.println("Second: ");
			String second = in.nextLine();
			
			System.out.print("My name is " +first +second+ "what");
			System.out.print(second);
			
			in.close();
	}
}
