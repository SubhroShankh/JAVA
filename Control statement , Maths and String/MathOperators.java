public class MathOperators {
    public static void main(String[] args) {
        System.out.println(Math.abs(-89)); // Returns the absolute value of -89 => 89
        System.out.println(Math.ceil(99.2)); // Returns the smallest integer greater than or equal to 99.2 => 100.0
        System.out.println(Math.floor(99.2)); // Returns the largest integer less than or equal to 99.2 => 99.0
        System.out.println(Math.round(99.25)); // Returns the closest integer to 99.25 => 99
        System.out.println(Math.sqrt(81)); // Returns the square root of 81 => 9.0
        System.out.println(Math.min(89, 56)); // Returns the smaller of 89 and 56 => 56
        System.out.println(Math.max(89, 56)); // Returns the larger of 89 and 56 => 89
        System.out.println(Math.pow(3, 2)); // Returns 3 raised to the power of 2 => 9.0
        System.out.println(Math.log(2)); // Returns the natural logarithm (base e) of 2 => 0.6931471805599453
        System.out.println(Math.exp(2)); // Returns e raised to the power of 2 (e²) => 7.38905609893065
        System.out.println(Math.sin(90)); // Returns the sine of π/2 radians => 0.8939966636005579
        System.out.println(Math.sin(Math.toRadians(90))); // Converts 90 degrees to radians and returns the sine => 1.0
        System.out.println(Math.PI); // Returns the value of π => 3.141592653589793

        System.out.println(Math.random()); // Returns a random double between 0.0 and 1.0
        for (int i = 0; i < 10; i++) {
            int random = (int)Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}
