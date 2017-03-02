package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
	public static void main(String[] args) throws IOException {

		/*Define string variable name and integer value age. 
		  Output question "What is your name?" 
		  Read the value name and output next question: “Where are you live, (name)?".
		  Read address and write whole information.*/	
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		String name = reader.readLine();
		
		System.out.println("How old are you?");
		int age = Integer.parseInt(reader.readLine());
		
		System.out.println("Where are you live, " + name + "?");
		String home = reader.readLine();
		
		System.out.println("Your name is " + name);
		System.out.println("You " + age);
		System.out.println("You live in " + home);
		
		
	}
}
