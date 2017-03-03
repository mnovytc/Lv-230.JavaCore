import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forest on 03.03.2017.
 */
public class Task2 {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.printf("What is your name?");
        String name = bufferedReader.readLine();
        int age;
        System.out.println("Where r u live, "+name+"?");
        String address = bufferedReader.readLine();
        System.out.printf("My name is: %s and i live on %s", name,address);
    }
}
