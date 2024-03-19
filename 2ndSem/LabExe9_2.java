import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LabExe9_2
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int math = getMathOperation();
		boolean check = validateOperation(math);
		if (check == true)
		{
			if (math == 1)
			{
				getSum();
			}
			else if (math == 2)
			{
				getDifference();
			}
			else if (math == 3)
			{
				getProduct();
			}
			else if (math == 4)
			{
				getQuotient();
			}
			else if (math == 5)
			{
				getPower();
			}
			else if (math == 6)
			{
				getSine();
			}
			else if (math == 7)
			{
				getCosine();
			}
			else if (math == 8)
			{
				getTangent();
			}
			else if (math == 9)
			{
				getSecant();
			}
			else if (math == 10)
			{
				getCosecant();
			}
			else if (math == 11)
			{
				getCotangent();
			}
			else if (math == 12)
			{
				getLogarithms();
			}
			else if (math == 13)
			{
				getSquareRoot();
			}
			else if (math == 14)
			{
				getConversion();
			}
			else if (math == 15)
			{
				println("Closing..");
				println("Thank you for using the program!");
			}
		}
		else
		{
			print ("Input should be between 0-15");
		}
	}
	
	
	public static int getMathOperation() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			println("CALCULATOR: ");
			println("	[1] ADD");
			println("	[2] SUBTRACT");
			println("	[3] MULTIPLY");
			println("	[4] DIVIDE");
			println("	[5] POWER");
			println("	[6] SINE");
			println("	[7] COSINE");
			println("	[8] TANGENT");
			println("	[9] SECANT");
			println("	[10] COSECANT");
			println("	[11] COTANGENT");
			println("	[12] LOGARITHMS");
			println("	[13] SQUARE ROOT");
			println("	[14] CONVERSION");
			println("	[15] EXIT");
			println("");
			print("Enter # of Command from the choices above: ");
			int math = Integer.parseInt(in.readLine()); 
			return math;
		}
	}
	
	public static boolean validateOperation(int math)
	{
		return (math >=0 && math <= 15);
	}
	
	public static void getSum() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter # of inputs to be added: ");
			int input = Integer.parseInt(in.readLine()); 
			int []arr = new int[input];
			
			print("Enter the numbers: ");
			String line = in.readLine();
	        String[] strs = line.trim().split("\\s+");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = Integer.parseInt(strs[i]);
	        }
	        
	        print("Enter \"Y\" if ");
	        print("\" ");
	        for (int i = 0; i < arr.length; i++) 
	           {     
	              System.out.print(arr[i]+" ");  
	           }
	        print("\"");
	        print("are your numbers [Y/N]: ");
	        String confirm = in.readLine(); 
	        if (confirm.equals("Y") || confirm.equals("y"))
	        {
	        	double sum = 0;
	        	for (int i = 0; i < arr.length; i++) 
		           {     
	        		sum = sum + arr[i];
		           }
	        	System.out.printf("The sum is %.2f",sum);
	        }
	        else
	        {
	        	print("restart program");
	        }  
		}
	}
	
	public static void getDifference() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter # of inputs to be added: ");
			int input = Integer.parseInt(in.readLine()); 
			int []arr = new int[input];
			
			print("Enter the numbers: ");
			String line = in.readLine();
	        String[] strs = line.trim().split("\\s+");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = Integer.parseInt(strs[i]);
	        }
	        
	        print("Enter \"Y\" if ");
	        print("\" ");
	        for (int i = 0; i < arr.length; i++) 
	           {     
	              System.out.print(arr[i]+" ");  
	           }
	        print("\"");
	        print("are your numbers [Y/N]: ");
	        String confirm = in.readLine(); 
	        if (confirm.equals("Y") || confirm.equals("y"))
	        {
	        	double difference = 0;
	        	for (int i = 0; i < arr.length; i++) 
		           {     
	        		difference = arr[i] - difference;
		           }
	        	System.out.printf("The sum is %.2f",difference);
	        }
	        else
	        {
	        	print("restart program");
	        }  
		}
	}
	
	public static void getProduct() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter # of inputs to be added: ");
			int input = Integer.parseInt(in.readLine()); 
			Double []arr = new Double[input];
			
			print("Enter the numbers: ");
			String line = in.readLine();
	        String[] strs = line.trim().split("\\s+");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = Double.parseDouble(strs[i]);
	        }
	        
	        print("Enter \"Y\" if ");
	        print("\" ");
	        for (int i = 0; i < arr.length; i++) 
	           {     
	              System.out.print(arr[i]+" ");  
	           }
	        print("\"");
	        print("are your numbers [Y/N]: ");
	        String confirm = in.readLine(); 
	        if (confirm.equals("Y") || confirm.equals("y"))
	        {
	        	double product = 1;
	        	for (int i = 0; i < arr.length; i++) 
		           {     
	        		product = ((product) * (arr[i]));
		           }
	        	System.out.printf("The product is %.2f",product);
	        }
	        else
	        {
	        	print("restart program");
	        }  
		}
	}
	
	public static void getQuotient() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter # of inputs to be added: ");
			int input = Integer.parseInt(in.readLine()); 
			int []arr = new int[input];
			
			print("Enter the numbers: ");
			String line = in.readLine();
	        String[] strs = line.trim().split("\\s+");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = Integer.parseInt(strs[i]);
	        }
	        
	        print("Enter \"Y\" if ");
	        print("\" ");
	        for (int i = 0; i < arr.length; i++) 
	           {     
	              System.out.print(arr[i]+" ");  
	           }
	        print("\"");
	        print("are your numbers [Y/N]: ");
	        String confirm = in.readLine(); 
	        if (confirm.equals("Y") || confirm.equals("y"))
	        {
	        	double quotient = 1;
	        	for (int i = 0; i < arr.length; i++) 
		           {     
	        		quotient = arr[i] / quotient;
		           }
	        	System.out.printf("The sum is %.2f",quotient);
	        }
	        else
	        {
	        	print("restart program");
	        }  
		}
	}
	
	public static void getPower() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter base number: ");
			double base = Double.parseDouble(in.readLine()); 
			print("Enter exponent: ");
			double exponent = Double.parseDouble(in.readLine()); 
			print("The output is ");
			System.out.print(Math.pow(base,exponent));
		}
	}
	
	public static void getSine() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter angle(degrees): ");
			double num = Double.parseDouble(in.readLine());
			num = Math.toRadians(num);
			print("The output is ");
			System.out.print(Math.sin(num));
		}
	}
	
	public static void getCosine() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter angle(degrees): ");
			double num = Double.parseDouble(in.readLine()); 
			num = Math.toRadians(num);
			print("The output is ");
			System.out.print(Math.cos(num));
		}
	}
	
	public static void getTangent() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter angle(degrees): ");
			double num = Double.parseDouble(in.readLine()); 
			num = Math.toRadians(num);
			print("The output is ");
			System.out.print(Math.tan(num));
		}
	}
	
	public static void getSecant() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter angle(degrees): ");
			double num = Double.parseDouble(in.readLine()); 
			num = Math.toRadians(num);
			print("The output is ");
			System.out.print(Math.tan(num));
		}
	}

	public static void getCosecant() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter angle(degrees): ");
			double num = Double.parseDouble(in.readLine()); 
			num = Math.toRadians(num);
			num = 1/Math.sin(num);
			print("The output is ");
			System.out.print(num);
		}
	}

	public static void getCotangent() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter angle(degrees): ");
			double num = Double.parseDouble(in.readLine()); 
			num = Math.toRadians(num);
			num = (Math.cos(num))/(Math.sin(num));
			print("The output is ");
			System.out.print(num);
		}
	}

	public static void getLogarithms() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter number: ");
			double num = Double.parseDouble(in.readLine()); 
			num = Math.log10(num); 
			print("The output is ");
			System.out.print(num);
		}
	}

	public static void getSquareRoot() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			print("Enter number: ");
			double num = Double.parseDouble(in.readLine()); 
			print("The output is ");
			System.out.print(Math.sqrt(num));
		}
	}
	
	public static void getConversion() throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			println("");
			println("");
			println("");
			println("	[1] meter");
			println("	[2] kilometer");
			println("	[3] inch");
			println("	[4] foot");
			println("	[5] mile");
			println("");
			print("Pick your unit of length[1-5]: ");
			int main = Integer.parseInt(in.readLine()); 
			boolean check = validateConversion(main);
			if (check == true)
			{
				print("Enter your number to be converted: ");
				double base = Integer.parseInt(in.readLine()); 
				println("From the previous choices,");
				print("Pick unit of length to be converted to: ");
				int sub = Integer.parseInt(in.readLine()); 
				boolean checkk = validateConversion2(sub);
				if (checkk == true)
				{
					if (main == 1)
					{
						if (sub == 1)
						{
							println("The output is: ");
							System.out.print(base + "m");
						}
						else if (sub == 2)
						{
							println("The output is: ");
							base = base * 0.001;
							System.out.print(base + "km");
						}
						else if (sub == 3)
						{
							println("The output is: ");
							base = base * 39.27;
							System.out.print(base + "in");
						}
						else if (sub == 4)
						{
							println("The output is: ");
							base = base * 3.28;
							System.out.print(base + "ft");
						}
						else if (sub == 5)
						{
							println("The output is: ");
							base = base * 0.000621;
							System.out.print(base + "mile");
						}
					}
					else if (main ==2)
					{
						if (sub == 1)
						{
							println("The output is: ");
							base = base * 1000;
							System.out.print(base + "m");
						}
						else if (sub == 2)
						{
							println("The output is: ");
							System.out.print(base + "km");
						}
						else if (sub == 3)
						{
							println("The output is: ");
							base = base * 39370.08;
							System.out.print(base + "in");
						}
						else if (sub == 4)
						{
							println("The output is: ");
							base = base * 3280.84;
							System.out.print(base + "ft");
						}
						else if (sub == 5)
						{
							println("The output is: ");
							base = base * 0.62;
							System.out.print(base + "mile");
						}
					}
					else if (main ==3)
					{
						if (sub == 1)
						{
							println("The output is: ");
							base = base * 0.03;
							System.out.print(base + "m");
						}
						else if (sub == 2)
						{
							println("The output is: ");
							base = base * 0.0000254;
							System.out.print(base + "km");
						}
						else if (sub == 3)
						{
							println("The output is: ");
							System.out.print(base + "in");
						}
						else if (sub == 4)
						{
							println("The output is: ");
							base = base * 0.08;
							System.out.print(base + "ft");
						}
						else if (sub == 5)
						{
							println("The output is: ");
							base = base * 0.0000158;
							System.out.print(base + "mile");
						}
					}
					else if (main ==4)
					{
						if (sub == 1)
						{
							println("The output is: ");
							base = base * 0.3;
							System.out.print(base + "m");
						}
						else if (sub == 2)
						{
							println("The output is: ");
							base = base * 0.000305;
							System.out.print(base + "km");
						}
						else if (sub == 3)
						{
							println("The output is: ");
							base = base * 12;
							System.out.print(base + "in");
						}
						else if (sub == 4)
						{
							println("The output is: ");
							System.out.print(base + "ft");
						}
						else if (sub == 5)
						{
							println("The output is: ");
							base = base * 0.000189;
							System.out.print(base + "mile");
						}
					}
					else if (main ==5)
					{
						if (sub == 1)
						{
							println("The output is: ");
							base = base * 1609.34;
							System.out.print(base + "m");
						}
						else if (sub == 2)
						{
							println("The output is: ");
							base = base * 1.61;
							System.out.print(base + "km");
						}
						else if (sub == 3)
						{
							println("The output is: ");
							base = base * 63360;
							System.out.print(base + "in");
						}
						else if (sub == 4)
						{
							println("The output is: ");
							base = base * 5280;
							System.out.print(base + "ft");
						}
						else if (sub == 5)
						{
							println("The output is: ");
							System.out.print(base + "mile");
						}
					}
				else
				{
					print("Input should be between 0-5");
				}
				
			}
			else
			{
				print("Input should be between 0-5");
			}
		}
		}
	}
	
	public static boolean validateConversion(int main)
	{
		return (main >=1 && main <= 5);
	}
	
	public static boolean validateConversion2(int sub)
	{
		return (sub >=1 && sub <= 5);
	}
	
	public static void println(String message)
	{
		System.out.println(message);
	}
	
	public static void print(String message)
	{
		System.out.print(message);
	}
}
