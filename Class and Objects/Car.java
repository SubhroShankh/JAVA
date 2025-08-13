
public class Car {

    // Static variable shared across all instances (tracks total cars sold)
    static int noOfCarSold;

    // Instance variables unique to each Car object
    int noOfWheels;                 
    String colour;                  
    float maxSpeed;                 
    float currentFuelInLiters;      
    int noOfSeats;                  

    // Static block: runs only once when the class is first loaded into memory
    static {
        noOfCarSold = 0;
        System.out.println("I am in Static Block.");
    }

    // Instance initializer block: runs every time a new object is created *before* the constructor
    {
        noOfCarSold++;  
        System.out.println("I am in init Block.");
    }

    // Constructor with a colour parameter
    Car(String colour) {
        noOfWheels = 4;
        this.colour = colour;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    // Default constructor: assigns colour as "Black" and sets fuel level to 5
    Car() {
        this("Black");             // Calls the above constructor
        currentFuelInLiters = 5;
    }

    // Method to start the car
    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel , can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode , please refuel.");
        } else {
            System.out.println("Car has started... bruhhh...");
            currentFuelInLiters--;     
        }
        return this;                   
    }

    // Method to drive the car
    public void drive() {
        currentFuelInLiters--;         
        System.out.println("Car is driving.");
    }

    // Method to add fuel to the car
    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    // Getter method: returns current fuel level
    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
 
    @Override
    protected void finalize() throws Throwable { // it is not guranteed to run and not ecommended to use finalize
        System.out.println("I am in finalize");
    }

}