import java.io.*;
/**
 * Created by mnganesh on 12/09/16.
 */
public class Main {
    public static void main(String[] args) throws IOException{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A :");
				int a = Integer.parseInt(br.readLine());
        System.out.println("Enter B:");
				int b = Integer.parseInt(br.readLine());
				System.out.println("Sum of A & B is " + Integer.toString(a+b));
    }
}
