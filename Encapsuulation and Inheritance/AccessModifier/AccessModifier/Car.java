package AccessModifier;

public class Car {
    public String colour;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car() {

    }

    public Car(String colour, String model, double fuelLevel, long costOfPurchase) {
        this.colour = colour;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car [colour=" + colour + ", model=" + model + ", fuelLevel=" + fuelLevel + ", costOfPurchase="
                + costOfPurchase + "]";
    }

}
