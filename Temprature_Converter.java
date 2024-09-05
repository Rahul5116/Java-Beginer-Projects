//package Github;

import java.util.Scanner;

public class Temprature_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTemperature Converter Menu:");
            System.out.println("1. Convert from Celsius to Fahrenheit");
            System.out.println("2. Convert from Celsius to Kelvin");
            System.out.println("3. Convert from Fahrenheit to Celsius");
            System.out.println("4. Convert from Fahrenheit to Kelvin");
            System.out.println("5. Convert from Kelvin to Celsius");
            System.out.println("6. Convert from Kelvin to Fahrenheit");
            System.out.println("7. EXIT");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "°C = " + fahrenheit + "°F");

            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double kelvin = celsius + 273.15;
                System.out.println(celsius + "°C = " + kelvin + "K");

            } else if (choice == 3) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
            } else if (choice == 4) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                System.out.println(fahrenheit + "°F = " + kelvin + "K");
            } else if (choice == 5) {
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin = scanner.nextDouble();
                double celsius = kelvin - 273.15;
                System.out.println(kelvin + "K = " + celsius + "°C");
            }else if (choice == 6) {
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin = scanner.nextDouble();
                double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
                System.out.println(kelvin + "K = " + fahrenheit + "°F");
            }else if (choice == 7) {
                System.out.println("Exiting the Temperature Converter. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option! Please choose a valid option (1-7).");
            }
        }
    }
}
