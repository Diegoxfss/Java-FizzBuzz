// import java scanner class
import java.util.Scanner;
//Fizzbuzzsoftware is the new class created for the Fizzbuzz project
public class Fizzbuzzsoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Console will request a number from user 
        System.out.print("Enter the number: ");
        // input x from user is equal to nextInt method from Scanner and it will store the input from user 
        int x = sc.nextInt();
      
        
        // Add an if-else statement to identify whether the number is positive or negative
        if (x > 0) {
            System.out.println( x + " is positive.");
        } else if (x < 0) {
            System.out.println( x + " is negative.");
        } else {
            System.out.println(x + " is zero.");
        }

        // Store the output in a string variable
        String output = "The Fizz, Buzz, and FizzBuzz and Prime Numbers are: \n";
        // For loop iterating until the input X to check prime numbers
        for (int i = 1; i <= x; i++) {
            boolean isPrime = true;
            // a nested loop[ for the prime number. If J is less than or equal to i divided by 2 it cannot be prime, then it's false and it won't show prime on the console after the number
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    // break to stop the loop
                    break;
                }
            }
            // conditions for the FizzBuzz game. 
            // i+ FizzBuzz if divisible by 3 and 5, else if Fizz if divisivle just by 3 and not  0 , else if  i + Buzz if divisible just by 5 and not 0 . Then, if statement isPrime ? i+ prime or repeat i if false.
            output += (i % 3 == 0 && i % 5 == 0) ? i + " FizzBuzz, " : (i % 3 == 0) ? i + " Fizz, " : (i % 5 == 0 && i % 3 != 0) ? i + " Buzz, " : (isPrime) ? i + " Prime, " : i + " ,";
        }

        // Get inputs for motion and force calculations
        System.out.print("Enter the mass (in kg): ");
        double m = sc.nextDouble();
        System.out.print("Enter the acceleration (in m/s^2): ");
        double a = sc.nextDouble();
        System.out.print("Enter the force (in N): ");
        double F = sc.nextDouble();

        // the velocity of an object is proportional to the square root of the product of its acceleration, force, and the inverse of its mass.
        double v = Math.sqrt(2 * a * F / m);
        // the distance travelled by an object is proportional to half the product of its acceleration, the square of its velocity, and the inverse of its force.
        double d = 0.5 * a * Math.pow(v, 2) / F;
        // Calculate momentum 
        double mo = m * v;
        // Calculate Kinetic energy 
        double ke = 0.5 * m * Math.pow(v, 2);
        // pressure
        double P = F / d;
        //density
        double rho = m / d;
        //gravitational potential energy
        double GPE = m * 9.8 * d;
        //Elastic potential energy
        double EPE = 0.5 * F * d;

        // Add results to output string
        output += "\nFormulas of motion and force: ";
        // I managed to roung down velocity and all other values were automatically rounded, the the Math round will be left just for the first calculation since it applies automatically to others.
        output += "\nVelocity: " + v + " m/s" + Math.round(v);
        output += "\nDistance: " + d + " m";
        output += "\nMomentum: " + mo + " kg*m/s";
        output += "\nKineticEnergy: " + mo + " kg*m/s";
        output += "\nPressure: " + P + " N/m^2";
        output += "\nDensity: " + rho + " kg/m^3";
        output += "\nGravitational Potential Energy: " + GPE + " J";
        output += "\nElastic Potential Energy Density: " + EPE + " J/m^3";

        // Get input for date calculation
        System.out.print("\nEnter a date in the format of dd mm yyyy: ");
        // consume newline character
        sc.nextLine(); 
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        int h = (day + (13 * (month + 1)) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // Add day of the week calculation to output string
        output += "\nThe day of the week for " + input + " is " + daysOfWeek[h];

        // Print the output string
        System.out.println(output);

        sc.close();
   
}}