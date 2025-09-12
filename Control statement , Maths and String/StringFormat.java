public class StringFormat {
    public static void main(String[] args) {
        String name = "Subhro";
        int marks = 504511114;

        System.out.println("Hello "+ name+ " your marks is: "+ marks);
        System.out.printf("Hello %s your marks is: %d\n", name, marks);
        System.out.printf("Hello %S your marks is: %,15d\n", name, marks);
        System.out.printf("Hello %10s your marks is: %+,15d\n", name, marks);
        System.out.printf("Hello %-10s your marks is: %+-,25d\n", name, marks);
        System.out.printf("Hello %10S your marks is: %0,15d\n", name, marks);

    }
}
