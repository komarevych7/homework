package homework10;

public class Car extends Vehicle{
    static String carType = "sedan";
    static String transmission = "auto";

    public Car(int speed, String model, String carType, String transmission){
        super(speed, model);
    }

    public void move(){
        System.out.println("Car move");
    }
}
