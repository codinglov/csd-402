import java.util.Scanner;
public class WaterHeater {

    public static void main(String[] args) {
        // prompt user for initial temperature of the water//
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the initial temperature of the water in degrees Celsius: ");
            // read the initial temperature from user input
            double initialTemperature = scanner.nextDouble();   

                // prompt user for desired temperature of the water
                System.out.print("Enter the desired temperature of the water in degrees Celsius: ");    
                // read the desired temperature from user input
                double desiredTemperature = scanner.nextDouble();
                // print the desired temperature to use the variable
                //System.out.println("Desired temperature entered: " + desiredTemperature);

                //prompt user for amount of water in kilograms
                System.out.print("Enter the amount of water in kilograms: ");       
                // read the amount of water from user input
                double amountOfWater = scanner.nextDouble();
                // print the amount of water to use the variable
                //System.out.println("Amount of water entered: " + amountOfWater + " kg");
                
                // calculate the energy required to heat the water
                double energy = amountOfWater * (desiredTemperature - initialTemperature) * 4184; // in Joules
                    // print the energy required to heat the water
                System.out.println("Energy required to heat the water: " + energy + " Joules");
            
                    scanner.close();
        }
    }



