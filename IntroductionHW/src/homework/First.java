package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
	public static void main(String[] args) throws IOException {

	/*	Flower bed is shaped like a circle. Calculate the perimeter and area by 
		entering the radius. Output obtained results.*/
		
		while (true) {
//			double pi = Math.PI;
			double pi = 3.14;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter radius");
			int radius = Integer.parseInt(reader.readLine());

			double area = pi * Math.pow(radius, 2);

			double perimetr = 2 * pi * radius;

			System.out.println("Area = " + area);
			System.out.println("Perimetr = " + perimetr);
		}
	}
}
