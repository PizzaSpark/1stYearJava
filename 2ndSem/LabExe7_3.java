import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe7_3 {
    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        try {

            // declaring string literal
            String word1 = "", word2 = "", msg = "";

            // enter word 1 & word 2
            System.out.print("Enter first word in upper case:");
            word1 = datain.readLine();
            System.out.print("Enter second word in lower case:");
            word2 = datain.readLine();

            // original words
            System.out.println("Original Text");
            System.out.println(word1 + "\n" + word2);

            // convert first word to lower case
            word1 = word1.toLowerCase();
            // convert second word to upper case
            word2 = word2.toUpperCase();

            // new modified words
            System.out.println("\nModified Text");
            System.out.println(word1 + "\n" + word2);

            // using concat method
            msg = word1.concat(word2);
            System.out.println("\nCombined words:\n" + msg);

            // using concat method with space
            msg = word1.concat(" " + word2);
            System.out.println("\nNew Combined words:\n" + msg);
        } catch (Exception e) {
            System.out.println("Error encountered");
        }
    }
}