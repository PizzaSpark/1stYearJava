

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lab3_2 {

	
	public static void main(String[] args)throws IOException {

		BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
		
		int []score = new int[5];
		int ctr=0;
		
		for(ctr=0; ctr<5; ctr++)
		{
			System.out.print("Enter "+(ctr+1)+" element: ");
			score[ctr]=Integer.parseInt(datain.readLine());
		}
		
		System.out.print("The scores are: ");
		for(ctr=0; ctr<5; ctr++)
		{
			System.out.print(score[ctr] + " ");
		}
	}

}
