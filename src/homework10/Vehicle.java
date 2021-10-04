package homework10;

public abstract class Vehicle {
    public int speed;
    private String model;

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public Vehicle(){}

    public void speedUp(int value){
        System.out.println("speed up to " + value);
    }
    public void applyBrake(int value){
        System.out.println("brake in " + value + " sec" );
    }
    public String getModel() {
        return model;
    }
    abstract public void move();
    final void stop(){
        System.out.println("Vehicle is stopped");
    }
}
