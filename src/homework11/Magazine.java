package homework11;

public class Magazine implements Printable{

    private String magazineName;

    public Magazine(String magazineName){
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Magazine " + magazineName);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable print: printables) {
            if (print instanceof Magazine)
                print.print();
        }
    }
}
