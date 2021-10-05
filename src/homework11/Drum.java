package homework11;

public class Drum implements Instuments{

    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum play. Size is: " + size);
    }
}
