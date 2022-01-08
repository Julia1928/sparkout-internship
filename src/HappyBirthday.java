import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
        import static java.lang.System.*;

public class HappyBirthday {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        System.in));

        String[] input = new String[2];
        String a;
        out.print("Please enter two integers: ");
        input = in.readLine().split(" ");

        a = String.valueOf(input[0]);
        int b = Integer.parseInt(input[1]);
        int c=2022-b;

        out.println("Happy Birthday "+a+"! Your age is "+c);
    }
}
