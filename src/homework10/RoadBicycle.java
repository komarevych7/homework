package homework10;

public class RoadBicycle extends Bicycle {
    private int rudderDepth;

    public int getRudderDepth() {
        return rudderDepth;
    }

    public RoadBicycle(int id, int gear, int rudderDepth){
        super(id, gear);
        this.rudderDepth = rudderDepth;
    }

    public void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    public void changeGear(){
        System.out.println("gear changed");
    }
}
