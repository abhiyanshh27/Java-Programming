import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your city: ");
        String city = br.readLine();  // Reads string

        System.out.println("You live in: " + city);
    }
}
