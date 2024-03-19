import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lab3_1 {

	
	public static void main(String[] args)throws IOException {

		BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
		
		int []score = new int[5];
		
		System.out.print("Enter 1 element: ");
		score[0]=Integer.parseInt(datain.readLine());
		System.out.print("Enter 2 element: ");
		score[1]=Integer.parseInt(datain.readLine());
		System.out.print("Enter 3 element: ");
		score[2]=Integer.parseInt(datain.readLine());
		System.out.print("Enter 4 element: ");
		score[3]=Integer.parseInt(datain.readLine());
		System.out.print("Enter 5 element: ");
		score[4]=Integer.parseInt(datain.readLine());
		
		System.out.print("The scores are: ");
		System.out.print(score[0]+ " "+score[1]+" "+score[2]+" "+score[3]+" "+score[4]);
	}

}
