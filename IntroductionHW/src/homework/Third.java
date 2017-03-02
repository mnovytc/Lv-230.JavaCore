package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {

	public static void main(String[] args) throws IOException {
		
		/*Phone calls from three different countries are с1, с2 and с3 standard units per minute. 
		Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all 
		talk together? Input all source data from console, make calculations and output to the screen.*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter standart unit per minute for first country");
		int C1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter talk duration for first country");
		int t1 = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter standart unit per minute for second country");
		int C2 = Integer.parseInt(reader.readLine());
		System.out.println("Enter talk duration for second country");
		int t2 = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter standart unit per minute for third country");
		int C3 = Integer.parseInt(reader.readLine());	
		System.out.println("Enter talk duration for third country");
		int t3 = Integer.parseInt(reader.readLine());

		int first = C1 * t1;
		int second = C2 * t2;
		int third = C3 * t3;
		int all = ((C1 * t1) + (C2 * t2) + (C3 * t3));

		System.out.println("Count for first country = " + first);
		System.out.println("Count for second country = " + second);
		System.out.println("Count for third country = " + third);
		System.out.println("Count for all countries = " + all);
	}

}
