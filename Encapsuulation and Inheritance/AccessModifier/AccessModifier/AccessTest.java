package AccessModifier;

public class AccessTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.colour = "Red";
        myCar.model = "Sedan";
        // myCar.fuelLevel = 50.0; // This line would cause a compile-time error
        // myCar.costOfPurchase = 20000; // This line would cause a compile-time error
        Car newCar = new Car("Black", "BMW", 1, 800);
        System.out.println(myCar);
        System.out.println(newCar);

    }
}
