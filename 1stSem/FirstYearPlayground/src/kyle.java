import java.util.Scanner;
public class kyle
{

	public static void main(String[] args) 
    {
        try
        {
            Scanner in = new Scanner(System.in);
            int ran = (int)(Math.random() * 100);
            
            do 
            {
                
                System.out.print("Guess the Number: ");
                int n = in.nextInt();
                
                if(n > ran)
                { 
                    System.out.println("Your Guess is higher than the answer, Guess again! ");
                }
                else if (n < ran) {
                    System.out.println("Soo close,but your guess is lower than the answer, Guess again! ");
                }
                else if (n == ran) {
                    System.out.println("Lets Fucking go you got it! The answer was: "+ran);
                    break;
                }
                
            }
            while(true);
            in.close();
            
        }catch (Exception e) {
            System.out.println("Error Exception");
        }
    }

}