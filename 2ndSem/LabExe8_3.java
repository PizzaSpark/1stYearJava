public class LabExe8_3 
{

	 public static void test(int num) 
	 {
	        num = 33;
	 }
	 
	 public static void println(String message) 
	 {
	        System.out.println(message);
	 }
	    public static void main (String[] args) 
	    {
	        int num = 10;
	        println("First print: " + num);
	        test(num);
	        println("Second print: " + num);
	    }

}