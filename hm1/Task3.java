import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forest on 03.03.2017.
 */
public class Task3 {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int[] arrayOfCalls = new int[3];
        
        for(int i=0; i<arrayOfCalls.length; i++){
            System.out.println("Enter standards unit per minute for "+(i+1)+"st country");
            int t=Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter talk duration for "+(i+1)+"st country");
            int c=Integer.parseInt(bufferedReader.readLine());
            arrayOfCalls[i]=t*c;
        }

        int sum=0;
        for(int i=0; i<arrayOfCalls.length; i++){
            System.out.println("for "+(i+1)+"st country = "+arrayOfCalls[i]);
            sum+=arrayOfCalls[i];
        }
        System.out.println("for all countries = "+sum);

    }
}
