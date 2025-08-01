

public class Car {
    
    static int noOfCarSold ;
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    
    static {
        noOfCarSold = 0;
        System.out.println("I am in Static Block.");
    }

    {
        noOfCarSold++;
        System.out.println("I am in init Block.");
    }

    Car(String colour){
        noOfWheels = 4;
        this.colour = colour;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;  
    }

    Car(){
        this("Black");
        currentFuelInLiters = 5;
    }

    public Car start(){
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel , can not start");
        } else if(currentFuelInLiters < 5){
            System.out.println("Car is in resevered mode ,please refuel.");
            
        } else {
                    System.out.println("Car has started... bruhhh...");
                    currentFuelInLiters--;
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving.");
        }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters; 
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}    