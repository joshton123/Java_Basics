class Book {
    
    static int totalNoOfBooks;

    String author ,title ,isbn;

    boolean isborrowed;
    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++; //Object Init
    }

    Book(String isbn , String title , String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
        if(isborrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isborrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }
    void returnBook(){
        if(isborrowed){
            this.isborrowed = false;
            System.out.println("Hope u enjoyed the book");
        }else{
            System.out.println("This book is already taken");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1" , "Design" , "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.borrowBook();
    }

}
