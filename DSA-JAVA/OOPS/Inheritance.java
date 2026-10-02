public class Inheritance {
    public static void main(String[] args) {

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

        // Fish shark = new Fish();
        // shark.eat();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}


// class Dog extends Mammal {
//     String breed;
// }

// Derived class
// class Fish extends Animal {
// int fins;

// void swims() {
// System.out.println("swims in water");
// }
// }
