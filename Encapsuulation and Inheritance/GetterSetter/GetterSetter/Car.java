package GetterSetter;

public class Car {
    private String color;// public
    private String model;// public
    private double fuelLevel;
    private long costOfPurchase; // default

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public long getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setCostOfPurchase(long costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }

    public void setColour(String color) {
        this.color = color;
    }

}
