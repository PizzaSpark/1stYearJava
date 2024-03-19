import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabExe7_2 {

    public static void main(String[] args) {

        BufferedReader detain = new BufferedReader(new InputStreamReader(System.in));
        try {
            int ctr = 0;
            String msg = "";

            System.out.print("Enter Message:");
            msg = detain.readLine();

            System.out.println("Using CharAt method:");
            System.out.println(msg.charAt(6));

            System.out.println("Using CharAt data type:");
            char result = msg.charAt(8);
            System.out.println(result);

            System.out.println("Using Loop:");
            for (ctr = 0; ctr < msg.length(); ctr++) {
                System.out.println(msg.charAt(ctr));
            }
        } catch (Exception e) {
            System.out.println("Error Encountered");
        }
    }
}