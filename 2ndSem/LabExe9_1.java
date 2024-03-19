import java.util.Scanner;
public class LabExe9_1
{
	public static void main(String[] args)
	{
		double hours = getHoursRendered();
		double rate = getRate();
		boolean check = validateHours(hours);
		if (check == true)
		{
			println("");
			println("");
			double gross = getGrossSalary(hours,rate);
			double net = getNetSalary(gross);
			printNetSalary(gross,net);
		}
		else
		{
			print ("Hours should be between 0-12");
		}
	}
	
	
	public static double getHoursRendered()
	{
		Scanner in = new Scanner(System.in);
		{
			print("Enter Hours Rendered: ");
			double hours = in.nextDouble(); 
			return hours;
		}
	}
	
	public static double getRate()
	{
		Scanner in = new Scanner(System.in);
		{
			print("Enter rate per hour: ");
			double rate = in.nextDouble(); 
			return rate;
		}
	}
	
	public static boolean validateHours(double hours)
	{
		return (hours >=0 && hours <= 12);
	}
	
	public static double getGrossSalary(double hours, double rate)
	{
		double h = hours;
		double r = rate;
		if (h>8)
		{
		double e = h-8;
		double salary = (8.0*r)+((2.0*r)*e);
		return salary;
		}
		else
		{
		double salary = (8.0*r)+(2.0*r);
		return salary;
		}
	}
	
	public static double getNetSalary(double d)
	{
		double g = d;
		double tax = (g*(0.3));
		double net = g - tax;
		return net;
	}
	
	public static void printNetSalary(double gross, double net)
	{
		System.out.printf("Gross Salary is %.2f",gross);
		println("");
		System.out.printf("Net Salary is %.2f",net);
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
