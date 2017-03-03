import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forest on 03.03.2017.
 */
public class Circle {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the radius");
        double radius = Integer.parseInt(bufferedReader.readLine());

        if(radius<=0){
            System.err.println("radius < 0 or = 0.");
        }
        else {
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("Perimetr is: %f and area is: %f", perimeter, area);
        }

    }
}
