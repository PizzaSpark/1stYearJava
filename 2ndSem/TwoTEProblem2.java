import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoTEProblem2 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String menu;
            do {
                String reverse = "";
                String output = "";
                char ch, chh;

                System.out.print("Enter Word: ");
                String word = in.readLine();

                for (int i = 0; i < word.length(); i++) {
                    ch = word.charAt(i);
                    reverse = ch + reverse;
                }

                for (int i = 0; i < word.length(); i++) {
                    ch = word.charAt(i);
                    output = output + ch;
                    chh = reverse.charAt(i);
                    output = output + chh;
                }

                System.out.println(output);

                System.out.println();
                System.out.print("Try again [Y/N]: ");
                menu = in.readLine();
                System.out.println();
            }

            while (menu.equalsIgnoreCase("Y"));

        } catch (Exception e) {
            System.out.println("Error Exception");
        }

    }
}