package ShankhSubhro;

import AccessModifier.Car;

public class MainTest {
    Car myCar = new Car(); // Now this will work

    public Car getMyCar() {
        return myCar;
    }

    @Override
    public String toString() {
        return "MainTest [myCar=" + myCar + "]";
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }
}