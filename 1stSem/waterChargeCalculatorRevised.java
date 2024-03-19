import java.util.Scanner;

// I ONLY REVISED THIS TO SEE MY IMPROVEMENT ~SEAN 2024


public class waterChargeCalculatorRevised {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {

			System.out.print("Enter Gallons Used: ");
			double gallons = in.nextInt();

			// W A T E R   C H A R G E
			double waterRate = 1.2;
			int hundredGallons = (int) (gallons / 100);
			double waterCharge = hundredGallons * waterRate;

			int waterChargeWholeNumber = (int) (waterCharge / 100); 
			int waterChargeDecimal = (int) (waterCharge % 100); 

			System.out.printf("Water Charge: %d peso(s) %d cent(s)\n", waterChargeWholeNumber, waterChargeDecimal);

			// S E W A G E   R A T E
			
			int sewageChargeWholeNumber = (int) (hundredGallons / 100); 
			int sewageChargeDecimal = (int) (hundredGallons % 100); 

			System.out.printf("Sewage Charge: %d peso(s) %d cent(s)\n", sewageChargeWholeNumber, sewageChargeDecimal);

			// C I T Y   T A X

			double taxPercentage = 0.02;
			double totalCharge = waterCharge + hundredGallons;
			double cityTax = totalCharge * taxPercentage;

			int cityTaxWholeNumber = (int) (cityTax / 100); 
			int cityTaxDecimal = (int) (cityTax % 100); 

			System.out.printf("City Tax: %d peso(s) %d cent(s)\n", cityTaxWholeNumber, cityTaxDecimal);

			// T O T A L   B I L L

			double totalBill = waterCharge + hundredGallons + cityTax;

			int totalBillWholeNumber = (int) (totalBill / 100);
			int totalBillDecimal = (int) (totalBill % 100); 

			System.out.printf("Total Bill: %d peso(s) %d cent(s)\n", totalBillWholeNumber, totalBillDecimal);
		}	
	}

}
