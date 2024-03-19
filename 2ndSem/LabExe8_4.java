public class LabExe8_4 
{

	public static void main(String[] args) 
	{
        int[] ages = {10,11,12};
        
        print("First run: ");
        for(int ctr = 0; ctr<ages.length;ctr++) 
        {
            print(ages[ctr] +" ");
        }
        test(ages);
        
        print("\nSecond run: ");
        for(int ctr=0; ctr<ages.length;ctr++) 
        {
            print(ages[ctr]+ " ");
        }

    }
	public static void print(String message) 
	{
        System.out.print(message);
    }
	public static void test(int[] arr) 
	{
        for(int ctr=0; ctr<arr.length; ctr++) 
        {
            arr[ctr] = ctr +50;
        }
    }

}
