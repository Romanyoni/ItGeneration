import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CelsiusToFahrenheit {
    public static void main(String[] args) throws IOException {

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);

        System.out.println("Enter temperature in degrees Celsius:");
        int celsius = Integer.parseInt(reader.readLine());
        System.out.println(celsius + " degrees Celsius equal " + (double) celsius * 9 / 5 + 32 +" degrees Fahrenheit.");
    }
}
