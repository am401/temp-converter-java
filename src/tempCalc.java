import java.util.InputMismatchException;
import java.util.Scanner;

public class tempCalc {
    public static void main(String args[]) {
        int userChoice = 0;
        String choiceOne = "1. Convert to Celsius";
        String choiceTwo = "2. Convert to Fahrenheit";

        // Prompt user for a choice whether they're converting C to F or vice versa
        Scanner choiceMenu = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);

        // Try statement to capture incorrect user input such as providing a char as
        // opposed to an integer
        try {
            userChoice = choiceMenu.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Error with data input: " + e);
            System.exit(1); // Exit the code if incorrect input was provided
        }

        if (userChoice == 1) {
            Scanner tempFahrenheit = new Scanner(System.in);
            System.out.println("Please provide the Fahrenheit temperature to convert: ");
            try {
                double fahrenheitToConvert = tempFahrenheit.nextDouble();
                double convertedFahrenheit = (fahrenheitToConvert - 32) * 0.5556;
                System.out.println("Thank you! Your converted temperature is " + convertedFahrenheit + "°C");
            }
            catch (InputMismatchException e) {
                System.out.println("Oops, your input cannot be converted.");
                System.out.println(e); // Print out Java captured error
            }
        } else if (userChoice == 2) {
                Scanner tempCelsius = new Scanner(System.in);
                System.out.println("Please provide the Celsius temperature to convert: ");
            try {
                double celsiusToConvert = tempCelsius.nextDouble();
                double convertedCelsius = (celsiusToConvert * 1.8) + 32;
                System.out.println("Thank you! Your converted temperature is " + convertedCelsius + "°F");
            }
            catch (InputMismatchException e) {
                System.out.println("Oops, your input cannot be converted.");
                System.out.println(e); // Print out Java captured error
            }
        } else {
            System.out.println("An incorrect selection was made.");
        }
    }
}