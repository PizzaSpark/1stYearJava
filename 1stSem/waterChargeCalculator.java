import java.util.Scanner;

public class waterChargeCalculator {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {

			System.out.print("Enter Gallons Used: ");
			double gallons = in.nextInt();

			// water charge

			// watera
			double wat = gallons / 100;
			int watb = (int) wat;
			double watc = (1.2) * watb;
			double watd = watc / 100;
			int watera = (int) watd;
			// waterb
			double wate = watd - watera;
			double watf = wate * 100;
			int waterb = (int) watf;

			System.out.printf("Water Charge: %d peso(s) %d cent(s)", watera, waterb);
			System.out.println();

			// sewage charge

			// sewagea
			double sewa = gallons / 10000;
			int sewagea = (int) sewa;
			// sewageb
			double sewb = sewa - sewagea;
			double sewc = sewb * 100;
			int sewageb = (int) sewc;

			System.out.printf("Sewage Charge: %d peso(s) %d cent(s)", sewagea, sewageb);
			System.out.println();

			// city tax

			// citya
			double cita = watera + sewagea + wate + sewb;
			double citb = cita * 0.02;
			int citya = (int) citb;
			// cityb
			double citc = citb - citya;
			double citd = citc * 100;
			int cityb = (int) citd;

			System.out.printf("City Tax: %d peso(s) %d cent(s)", citya, cityb);
			System.out.println();

			// totalbill

			// billa
			double totala = (watera + sewagea + citya) * 100;
			double totalb = waterb + sewageb + cityb;
			double totalc = (totala + totalb);
			double totald = totalc / 100;
			int billa = (int) totald;
			// billb
			double totale = totald - billa;
			double totalf = totale * 100;
			double totalg = Math.round(totalf);
			int billb = (int) totalg;

			System.out.printf("Sewage Charge: %d peso(s) %d cent(s)", billa, billb);
			System.out.println();

		}
	}

}
