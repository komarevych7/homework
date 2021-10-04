package homework10;

public class Horse extends Animal {

    private boolean heeled;

    public Horse (String food, String location, boolean heeled){
        super(food, location);
        this.heeled = heeled;
    }

    public void eat() {
        System.out.println("Horse eat grass");
    }

    public void makeNoise() {
        System.out.println("Horse make noise igo-go");
    }

    public boolean isHeeled() {
        return heeled;
    }
}
