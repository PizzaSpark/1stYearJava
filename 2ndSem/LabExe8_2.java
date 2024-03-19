import java.util.Scanner;
public class LabExe8_2
{
	public static void main(String[] args)
	{
		int score = getScore();
		int validate = validateScore(score);
		if (validate == 0)
		{
			print("Entered score should be within 0-100");
		}
		else if (validate == 1)
		{
			double grade = getGrade(score);
			printGrade(grade);
		}
	}
	
	
	public static int getScore()
	{
		Scanner in = new Scanner(System.in);
		{
			print("Input course score: ");
			return in.nextInt();
		}
	}
	
	public static int validateScore(int score)
	{
		int validate = 0;
		if (score >=0 && score <= 100) 
		{
			validate= validate+1;
			{

			}
	    }
		return validate;
	}
	
	public static double getGrade(int score)
	{
		return ((score/100.0)*60)+40;
	}
	
	public static void printGrade(double grade)
	{
		println("Your grade is "+grade);
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
