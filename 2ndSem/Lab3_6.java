import java.util.Scanner;

public class Lab3_6 {

    public static void main(String[] args) {
        try {
            int score[] = new int[10];
            int ctr = 0;
            double total = 0;
            String ans;

            Scanner in = new Scanner(System.in);
            do {
                System.out.println();
                System.out.print("Enter the numbers: ");

                for (ctr = 0; ctr < score.length; ctr++) {
                    score[ctr] = in.nextInt();
                    total = total + score[ctr];
                }
                double average = total / score.length;

                System.out.println();
                System.out.print("The average is: " + average);
                System.out.println();
                System.out.print("The numbers below the average ");
                for (ctr = 0; ctr < score.length; ctr++) {
                    if (score[ctr] < average) {
                        System.out.print(score[ctr] + " ");
                    }
                }

                System.out.println();

                System.out.print("The numbers above the average ");
                for (ctr = 0; ctr < score.length; ctr++) {
                    if (score[ctr] > average) {
                        System.out.print(score[ctr] + " ");
                    }
                }
                System.out.println();
                System.out.println();
                System.out.print("Try again[Y/N]? ");
                ans = in.next();
            } while (ans.equalsIgnoreCase("Y"));
            in.close();

        } catch (Exception e) {
            System.out.println("Error Exception");
        }
    }

}