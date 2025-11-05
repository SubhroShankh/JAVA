package ShankhSubhro;

import GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Sedan", 50.0, 20000);
        System.out.println("Car Color: " + myCar.getColor());
        System.out.println("Car Model: " + myCar.getModel());
        myCar.setColour("Blue");
        System.out.println("Updated Car Color: " + myCar.getColor());

    }

}
