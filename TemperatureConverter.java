package prodigy;

import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature and unit input
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.next().toLowerCase();

        // Perform conversion based on the original unit
        switch (originalUnit) {
            case "celsius":
                convertCelsius(temperature);
                break;
            case "fahrenheit":
                convertFahrenheit(temperature);
                break;
            case "kelvin":
                convertKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        scanner.close();
}
    // Convert Celsius to Fahrenheit and Kelvin
    private static void convertCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Display the converted values
        System.out.println(celsius + " Celsius is equal to:");
        System.out.println(fahrenheit + " Fahrenheit");
        System.out.println(kelvin + " Kelvin");
    }

    // Convert Fahrenheit to Celsius and Kelvin
    private static void convertFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit + 459.67) * 5/9;

        // Display the converted values
        System.out.println(fahrenheit + " Fahrenheit is equal to:");
        System.out.println(celsius + " Celsius");
        System.out.println(kelvin + " Kelvin");
    }

    // Convert Kelvin to Celsius and Fahrenheit
    private static void convertKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin * 9/5) - 459.67;

        // Display the converted values
        System.out.println(kelvin + " Kelvin is equal to:");
        System.out.println(celsius + " Celsius");
        System.out.println(fahrenheit + " Fahrenheit");
    }
}