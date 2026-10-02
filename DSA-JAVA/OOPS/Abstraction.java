public class Abstraction {
    public static void main(String[] args) {

        Mustang myHorse = new Mustang();

        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");

        // color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void ChangeColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called ");
    }
}

class Chicken extends Animal {

    void ChangeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs ");
    }
}
