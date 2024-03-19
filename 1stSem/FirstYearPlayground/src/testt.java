import java.io.BufferedReader;
import java.io.InputStreamReader;
public class testt
{
    
    
    public static void main(String[] args) 
    {
        try
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String menu;
            do 
            {

                int [][] hit = new int [5][5];
                System.out.println(hit [0][0]);
                    
                System.out.println();
                System.out.print("Try again [Y/N]: ");
                menu = in.readLine();    
                System.out.println();
            }
            
            while (menu.equalsIgnoreCase("Y"));
            
       }
        catch (Exception e) 
        {
            System.out.println("Error Exception");
        }
        
    }
}