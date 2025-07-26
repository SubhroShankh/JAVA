

public class Car {
    int noOfWheels;
    String colour;
    Float maxSpeed;
    Float currentFuelInLiters;
    int noOfSeats;

    public void drive() {
        System.out.println("Car is driving.");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel; 
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
