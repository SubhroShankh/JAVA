class Book {
    
    public static void main(String[] args) {
        Book designOfThings = new Book("85e");
        Book myBook = new Book("12", "Design", "Subhro");
        System.out.println(Book.getTotalNumBooks());
        designOfThings.borrowBook();
        designOfThings.returnBorrow();
        designOfThings.returnBorrow();

    }
    
    static int totalNumbersBook;
    String Title;
    String Author;
    String isbn;
    boolean isBorrowed;
    
    static {
        totalNumbersBook = 0;
    }

    {
        totalNumbersBook++;
    }

    Book(String isbn , String Title , String Author ) {
        this.Title = Title;
        this.Author = Author;
        this.isbn = isbn;
    }

    Book (String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNumBooks(){
         return totalNumbersBook;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book.");
        }
    }

    void returnBorrow(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please visit again");
        }else{
            System.out.println("This book already exist in the Library.");
        }
    }  

    

}
