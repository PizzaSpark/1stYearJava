import java.util.Scanner;
public class slumbookWithInput {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
			System.out.println("ABOUT ME");
			System.out.println();
			System.out.print("First Name: ");
			String first = in.nextLine();
			System.out.print("Last Name: ");
			String last = in.nextLine();
			System.out.print("Middle Name: ");
			String mid = in.nextLine();
			System.out.print("Age: ");
			String age = in.nextLine();
			System.out.print("Birthday: ");
			String bday = in.nextLine();
			System.out.print("Address: ");
			String address = in.nextLine();
			System.out.print("Contact Number: ");
			String contact = in.nextLine();
			System.out.print("Motto: ");
			String motto = in.nextLine();
			System.out.println();
			System.out.println("FAVORITES");
			System.out.println();
			System.out.print("Food: ");
			String food = in.nextLine();
			System.out.print("Color: ");
			String color = in.nextLine();
			System.out.print("Song: ");
			String song = in.nextLine();
			System.out.print("Movie: ");
			String movie = in.nextLine();
			System.out.print("Describe yourself: ");
			String describe = in.nextLine();
			System.out.println();
			System.out.println("Hello! My name is " +first+ " " +mid+ " " +last+ ".");
			System.out.println("I am " +age+ " years old.");
			System.out.println("My birthday is on " +bday+ ". Be sure to wish me a happy birthday on my birthday :D");
			System.out.println("Don't tell anyone but you can find me at " +address+ ".");
			System.out.println("You may want to call me at this number " +contact+ ".");
			System.out.println("My motto in life is "+ "\"" +motto+ "\"" + ".");
			System.out.println("Now let's talk about my favorites!");
			System.out.println("My favorite food is " +food+ " and my favorite color is " +color+ ".");
			System.out.println("I am " +age+ " years old.");
			System.out.println("Hey! Have you heard about the song " + "\"" +song+ "\"? It's my favorite song!");
			System.out.println("My favorite movie is called " + "\"" +movie+ "\"" + ".");
			System.out.println("Before we end this, if I were to describe myself, " +describe+ " would be the right term.");
			System.out.println("Alright, till next time. Goodbye!");
			
			in.close();
	}
}
