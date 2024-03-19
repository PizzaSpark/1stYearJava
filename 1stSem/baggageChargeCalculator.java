import java.util.Scanner;

public class baggageChargeCalculator {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {

			System.out.print("Enter baggage weight: ");
			int weight = in.nextInt();

			System.out.print("Enter Zone: ");
			String zone = in.next();

			if (weight == 1) {

				if (zone.equals("A")) {
					System.out.println("Baggage Charge: 1.01");
				} else if (zone.equals("B")) {
					System.out.println("Baggage Charge: 1.52");
				} else if (zone.equals("C")) {
					System.out.println("Baggage Charge: 1.65");
				} else if (zone.equals("D")) {
					System.out.println("Baggage Charge: 1.85");
				}
			}

			else if (weight == 3) {
				if (zone.equals("A")) {
					System.out.println("Baggage Charge: 1.58");
				} else if (zone.equals("B")) {
					System.out.println("Baggage Charge: 2.01");
				} else if (zone.equals("C")) {
					System.out.println("Baggage Charge: 2.43");
				} else if (zone.equals("D")) {
					System.out.println("Baggage Charge: 3.05");
				}
			}

			else if (weight == 5) {
				if (zone.equals("A")) {
					System.out.println("Baggage Charge: 1.71");
				} else if (zone.equals("B")) {
					System.out.println("Baggage Charge: 2.52");
				} else if (zone.equals("C")) {
					System.out.println("Baggage Charge: 3.11");
				} else if (zone.equals("D")) {
					System.out.println("Baggage Charge: 4.05");
				}
			}

			else if (weight == 10) {
				if (zone.equals("A")) {
					System.out.println("Baggage Charge: 2.04");
				} else if (zone.equals("B")) {
					System.out.println("Baggage Charge: 3.12");
				} else if (zone.equals("C")) {
					System.out.println("Baggage Charge: 4.05");
				} else if (zone.equals("D")) {
					System.out.println("Baggage Charge: 5.01");
				}
			}

			else if (weight < 999999999) {
				if (zone.equals("A")) {
					System.out.println("Baggage Charge: 2.52");
				} else if (zone.equals("B")) {
					System.out.println("Baggage Charge: 3.75");
				} else if (zone.equals("C")) {
					System.out.println("Baggage Charge: 5.18");
				} else if (zone.equals("D")) {
					System.out.println("Baggage Charge: 7.25");
				}
			}
		}
	}
}