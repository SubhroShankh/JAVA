

public class Driver {

    static int minAgeForDriving;

    String name;
    int age ;
    String dateOfLicence;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {
        /*Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive(); 
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel()); */

        Car swift = new Car("pink");
        Car thar  = new Car();
        //swift.addFuel(6);
        /*Car startedCar = swift.start();
        startedCar.drive(); */
        swift.start().drive(); 
        System.out.println(swift.colour);
        System.out.println(thar.colour);


        /*Driver myDriver = new Driver();
        myDriver.dateOfLicence = "1/jan/2025";
        System.out.println(minAgeForDriving);  */
    }
} 