package homework11;

public class InstrumentMain {
    public static void main(String[] args) {
        Instuments guitar = new Guitar(6);
        Instuments drum = new Drum(40);
        Instuments trumpet = new Trumpet(20);
        Instuments[] instuments = {guitar, drum, trumpet};

        for (Instuments instrument: instuments) {
            instrument.play();
        }
    }
}
