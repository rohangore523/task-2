import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Fixed Value: %.2f°F = %.2f°C\n", fahrenheit, celsius);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double userFahrenheit = scanner.nextDouble();

        double userCelsius = (userFahrenheit - 32) * 5 / 9;

        System.out.printf("User Input: %.2f°F = %.2f°C", userFahrenheit, userCelsius);

        scanner.close();
    }
}