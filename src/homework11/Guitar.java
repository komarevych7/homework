package homework11;

public class Guitar implements Instuments{

    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Guitar pay with " + numberOfStrings + " strings.");
    }
}
