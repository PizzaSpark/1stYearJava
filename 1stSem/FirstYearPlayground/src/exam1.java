public class exam1 {

	public static void main(String[] args) {
		
		int counter = 0;
		String [] nums = {"345", "2", "6"};
		
		for (int i = 0; i < nums.length; i++) 
		{
			int length = String.valueOf(nums[i]).length();
			if(length % 2 == 0)
			{
				counter++;
			}
        }
		System.out.print(counter);
	}
}

	
	

