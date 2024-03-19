import java.util.Scanner;
public class SellingPrice {
	
	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			
	        System.out.print("Enter Cost: ");
			int Cost = in.nextInt(); 
			
	        System.out.print("Enter Margin: ");
			double yes = in.nextInt();
			System.out.print("%");
			
			double Margin = yes / 100;
			double temp = 1 - Margin;
		    double tempa = 1 / temp;
		    double tempb = tempa * Cost;
		    
		    System.out.printf("Selling Price: %.2f",tempb);
		    
		}
			
	}	
	}

