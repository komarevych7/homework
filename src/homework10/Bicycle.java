package homework10;

public abstract class Bicycle extends Vehicle {
    public final int id;
    protected int gear;

    public Bicycle(int speed, String model, int id, int gear){
        super(speed, model);
        this.id = 1;
        this.gear = gear;
    }

    public Bicycle(int id, int gear) {
        super();
        this.id = 0;
    }

    protected Bicycle() {
        id = 0;
    }


    public void speedUp(int value){
        System.out.println("Bicycle speed up to: " + value);
    }

    public void applyBrake(int value){
        System.out.println("Bicycle brake in: " + value);
    }

    public void move(){
        System.out.println("bike move");
    }
    abstract public void changeGear();

}
