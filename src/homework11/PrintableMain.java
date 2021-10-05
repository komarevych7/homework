package homework11;

public class PrintableMain {
    public static void main(String[] args) {
        Printable book = new Book("Stalker");
        Printable book2 = new Book("Vedmak");
        Printable magazine = new Magazine("VOGUE");
        Printable magazine2 = new Magazine("Play Boy");
        Printable[] printables = {book, book2, magazine, magazine2};
        for (Printable print: printables) {
            print.print();
        }

        System.out.println("");

        System.out.println("Only magazines below: ");
        Magazine.printMagazines(printables);

        System.out.println("");

        System.out.println("Only books below: ");
        Book.printBooks(printables);
    }
}
