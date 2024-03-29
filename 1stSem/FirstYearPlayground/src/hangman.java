import java.util.Scanner;

public class hangman {

    public static void main(String[] args) {
        int tries = 0;

        boolean iterated = false;
        String temp = "";
        String holder = "";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your secret word:");
        String word = keyboard.nextLine();

        do {
            System.out.println("Enter your letter guess");
            String guess = keyboard.nextLine();

            for(int i = 0; i < word.length(); i++) 
            {
                if (guess.equals(Character.toString(word.charAt(i)))) 
                {
                    if(!iterated)
                        temp = temp + Character.toString(word.charAt(i));
                    else 
                    {
                        holder = Character.toString(temp.charAt(i)).replace("-", guess);
                        temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
                    }
                } else {
                    if(!iterated) {
                        temp = temp + "-";
                    }
                }
            } 
            tries++;
            iterated = true;
            System.out.println(temp);
            if(temp.equals(word)) {
                System.out.println("You guessed correctly!");
                break;
            }
        }while (tries < 10);

    }
}