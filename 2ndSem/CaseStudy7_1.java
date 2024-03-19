import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CaseStudy7_1 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String menu;

			do {
				String[] animals = { "zebra", "mouse", "sheep", "whale", "sloth", "eagle", "gecko", "gorilla",
						"peacock", "hamster" };
				String[] natural = { "dirt", "air", "water", "fire", "wood", "blood", "hair", "gold", "silver",
						"coal" };
				String[] fruits = { "lemon", "mango", "melon", "apple", "peach", "lychee", "citrus", "orange",
						"starfruit", "grape" };
				String[] disease = { "diabetes", "measles", "polio", "influenza", "malaria", "arthritis", "fever",
						"chickenpox", "covid", "Mumps" };
				int ran = (int) (Math.random() * 9);
				String blank = "";
				String temp = "";
				int answer = 0;

				System.out.println("Welcome to Guess the Word Game!");
				System.out.println("Category");
				System.out.println("[1] Animals");
				System.out.println("[2] Natural Elements");
				System.out.println("[3] Fruits");
				System.out.println("[4] Disease");
				System.out.print("Choose a category: ");
				int cat = Integer.parseInt(in.readLine());
				System.out.print("The category is ");

				if (cat == 1) {
					String wordd = animals[ran];
					System.out.print("Animals.");
					System.out.println();
					System.out.println();
					System.out.println("Hidden Word:");
					temp = wordd.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "-");
					System.out.println(temp);
					for (int i = 0; i < 5; i++) {
						System.out.print("Enter letter: ");
						String guess = in.readLine();
						guess = guess.toLowerCase();
						for (int j = 0; j < wordd.length(); j++) {
							if (guess.equals(Character.toString(wordd.charAt(j)))) {
								blank = Character.toString(temp.charAt(j)).replace("-", guess);
								temp = temp.substring(0, j) + blank + temp.substring(j + 1, temp.length());
							}
						}
						System.out.println(temp);
						if (temp.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
							answer++;
							break;
						}
						System.out.println();
					}

					if (answer == 0) {
						System.out.print("Enter final guess: ");
						String finalguess = in.readLine();
						if (finalguess.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
						} else {
							System.out.println("Your guess is wrong. The correct answer is " + wordd);
						}
					}
				}

				else if (cat == 2) {
					String wordd = natural[ran];
					System.out.print("Natural Elements.");
					System.out.println();
					System.out.println();
					System.out.println("Hidden Word:");
					temp = wordd.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "-");
					System.out.println(temp);
					for (int i = 0; i < 5; i++) {
						System.out.print("Enter letter: ");
						String guess = in.readLine();
						guess = guess.toLowerCase();
						for (int j = 0; j < wordd.length(); j++) {
							if (guess.equals(Character.toString(wordd.charAt(j)))) {
								blank = Character.toString(temp.charAt(j)).replace("-", guess);
								temp = temp.substring(0, j) + blank + temp.substring(j + 1, temp.length());
							}
						}
						System.out.println(temp);
						if (temp.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
							answer++;
							break;
						}
						System.out.println();
					}

					if (answer == 0) {
						System.out.print("Enter final guess: ");
						String finalguess = in.readLine();
						if (finalguess.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
						} else {
							System.out.println("Your guess is wrong. The correct answer is " + wordd);
						}
					}
				}

				else if (cat == 3) {
					String wordd = fruits[ran];
					System.out.print("Fruits.");
					System.out.println();
					System.out.println();
					System.out.println("Hidden Word:");
					temp = wordd.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "-");
					System.out.println(temp);
					for (int i = 0; i < 5; i++) {
						System.out.print("Enter letter: ");
						String guess = in.readLine();
						guess = guess.toLowerCase();
						for (int j = 0; j < wordd.length(); j++) {
							if (guess.equals(Character.toString(wordd.charAt(j)))) {
								blank = Character.toString(temp.charAt(j)).replace("-", guess);
								temp = temp.substring(0, j) + blank + temp.substring(j + 1, temp.length());
							}
						}
						System.out.println(temp);
						if (temp.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
							answer++;
							break;
						}
						System.out.println();
					}

					if (answer == 0) {
						System.out.print("Enter final guess: ");
						String finalguess = in.readLine();
						if (finalguess.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
						} else {
							System.out.println("Your guess is wrong. The correct answer is " + wordd);
						}
					}
				}

				else if (cat == 4) {
					String wordd = disease[ran];
					System.out.print("Disease.");
					System.out.println();
					System.out.println();
					System.out.println("Hidden Word:");
					temp = wordd.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "-");
					System.out.println(temp);
					for (int i = 0; i < 5; i++) {
						System.out.print("Enter letter: ");
						String guess = in.readLine();
						guess = guess.toLowerCase();
						for (int j = 0; j < wordd.length(); j++) {
							if (guess.equals(Character.toString(wordd.charAt(j)))) {
								blank = Character.toString(temp.charAt(j)).replace("-", guess);
								temp = temp.substring(0, j) + blank + temp.substring(j + 1, temp.length());
							}
						}
						System.out.println(temp);
						if (temp.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
							answer++;
							break;
						}
						System.out.println();
					}

					if (answer == 0) {
						System.out.print("Enter final guess: ");
						String finalguess = in.readLine();
						if (finalguess.equals(wordd)) {
							System.out.println("You guessed the word correctly!");
						} else {
							System.out.println("Your guess is wrong. The correct answer is " + wordd);
						}
					}
				}

				System.out.println();
				System.out.println();
				System.out.print("Try again Y/N?: ");
				menu = in.readLine();
				System.out.println();

			}

			while (menu.equalsIgnoreCase("Y"));

		} catch (Exception e) {
			System.out.println("Error Exception");
		}

	}
}