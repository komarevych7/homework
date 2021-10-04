package homework10;

public class MountainBicycle extends Bicycle {
    private int seatHeight;

    public MountainBicycle(int seatHeight){
        this.seatHeight = seatHeight;
    }

    public MountainBicycle(){
    }

    public MountainBicycle(int speed, String model, int id, int gear, int seatHeight){
        super(speed, model,id, gear);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void changeGear(){
        System.out.println("gear changed");
    }


}
