package homework11;

public class Book implements Printable{

    private String bookName;

    public Book(String bookName){
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Book " + bookName);
    }

    public static void printBooks(Printable[] printables){
        for (Printable print: printables) {
            if (print instanceof Book) {
                print.print();
            }
        }
    }
}

