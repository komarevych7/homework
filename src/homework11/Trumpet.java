package homework11;

public class Trumpet implements Instuments{

    private int diametr;

    public Trumpet(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Trumpet play and it is diameter: " + diametr);
    }
}
