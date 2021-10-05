package homework10;

public interface BicycleInterface {
    void buyBike();
    default void navigation(){
        System.out.println("Navigation to your place started");
    }
    static void bikeInfo(){
        System.out.println("2 steel wheels and many other details");
    }
}
