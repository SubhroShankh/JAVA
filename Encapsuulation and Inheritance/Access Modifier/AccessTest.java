

public class AccessTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        // myCar.fuelLevel = 50.0; // Error: fuelLevel has private access in Car
        // myCar.costOfPurchase = 20000; // Error: costOfPurchase has private access in Car

        
    }
}
