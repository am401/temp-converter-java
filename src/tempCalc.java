import java.util.Scanner;

public class tempCalc {
    public static void main(String args[]) {
        String choiceOne = "1. Convert to Celsius";
        String choiceTwo = "2. Convert to Fahrenheit";

        Scanner choiceMenu = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);

        int userChoice = choiceMenu.nextInt();

        if (userChoice == 1) {
            Scanner tempFahrenheit = new Scanner(System.in);
            System.out.println("Please provide the Fahrenheit temperature to convert: ");
            double fahrenheitToConvert = tempFahrenheit.nextDouble();
            double convertedFahrenheit = (fahrenheitToConvert - 32) * 0.5556;
            System.out.println("Thank you! Your converted temperature is " + convertedFahrenheit + "°C");
        } else {
            Scanner tempCelsius = new Scanner(System.in);
            System.out.println("Please provide the Celsius temperature to convert: ");
            double celsiusToConvert = tempCelsius.nextDouble();
            double convertedCelsius = (celsiusToConvert * 1.8) + 32;
            System.out.println("Thank you! Your converted temperature is " + convertedCelsius + "°F");
        }
    }
}
