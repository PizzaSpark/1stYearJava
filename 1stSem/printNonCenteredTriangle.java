public class printNonCenteredTriangle {

	public static void main(String[] args) {
		
		
		int x, y;
		int z = 5;
		
		for (x = 1; x <= z; x++) 
		{
			for (y = 1; y <= x; y++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
