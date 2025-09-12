public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String Company;
    
    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        Company = company;
    }
    
    

    @Override
    public String toString() {
        return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
                + name + ", modelNumber=" + modelNumber + ", Company=" + Company + "]";
    }  

    public static void main(String[] args) {
        Car alto = new Car(4, 4, 120, "alto", "SW875", "Maruti");
        System.out.println(alto.toString()); 

    }

    
}
