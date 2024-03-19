import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CaseStudy5_3
{
	
	
	public static void main(String[] args) 
	{
		try
        {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String menu;

		System.out.println("Made by Sean Godric Reyes & Kyle Jay Tuazon");
		System.out.println();
			do 
			{


				System.out.print("How many digits?: ");
				int ctr=Integer.parseInt(in.readLine());
					
				int []arr = new int[ctr];
				
		        System.out.print("Enter "+ctr+" digits[0-9]: ");
		        
		        String line = in.readLine();
		        String[] strs = line.trim().split("\\s+");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = Integer.parseInt(strs[i]);
		        }
		        
		     
		        for (int a = 0; a < arr.length; a++) 
		        {
		        	
		        	//checking if they are 0-9
		        	if (arr[a] < 0 || arr[a] > 9) 
	                {     

		        		 System.out.println("Number outside the values 0-9 is detected! ");
		        		 System.out.println("Please try again!");
		        		 break;
	                }
		        	//checking if it already checked the last integer 
		        	else if (arr.length-1 == a) 
	                {     
		        		//sorting
				        Arrays.sort(arr);
				        //printing
				        
				        System.out.println();
				        System.out.print("0: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 0) 
				              System.out.print("*");  
				           }
				       
				        System.out.println();
				        
				        System.out.print("1: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 1) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("2: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 2) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("3: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 3) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("4: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 4) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("5: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 5) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("6: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 6) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("7: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 7) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("8: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 8) 
				              System.out.print("*");  
				           }
				        
				        System.out.println();
				        
				        System.out.print("9: ");
				        
				        for (int i = 0; i < arr.length; i++) 
				           {   
				        	if (arr[i] == 9) 
				              System.out.print("*");  
				           }  
				        
	                }

		        }
		        
				System.out.println();
				System.out.println();
				System.out.print("Try again Y/N?: ");
				menu = in.readLine();	
				System.out.println();
			}

			while (menu.equalsIgnoreCase("Y"));
			
        }
		
		catch (Exception e) 
		{
            System.out.println("Error Exception");
        }
		
	}
}

