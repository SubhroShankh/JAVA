// The Driver class represents a person who may be allowed to drive
public class Driver {

    // Static variable shared across all Driver instances
    // Defines the minimum age required to drive (e.g., 18)
    static int minAgeForDriving;

    // Instance variables - unique for every Driver object
    String name;             // Driver's name
    int age;                 // Driver's age
    String dateOfLicence;    // License issue date

    // Method to check if the driver is allowed to drive
    // Returns true if age is greater than or equal to minimum age
    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        //  This section is commented out. It creates a Car object,
        // adds fuel, drives it multiple times, then checks fuel level.
        /*
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive(); 
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        */

        //  Creating two Car objects
        Car swift = new Car("pink");   // Car with specified colour
        Car thar  = new Car();         // Car with default colour ("Black")

        //  This line is commented out, it would add extra fuel to swift
        // swift.addFuel(6);

        // Start swift car and immediately drive it
        swift.start().drive();         // Method chaining (start then drive)

        // Print colour of the cars
        System.out.println(swift.colour);  // Outputs "pink"
        System.out.println(thar.colour);   // Outputs "Black"

        //  This section is commented out, initializes a Driver
        // and assigns a license date. Then prints minimum age.
        /*
        Driver myDriver = new Driver();
        myDriver.dateOfLicence = "1/jan/2025";
        System.out.println(minAgeForDriving);
        */
    }
}