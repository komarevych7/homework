package homework10;

public class VehicleMain {
    public static void main(String[] args) {
        MountainBicycle mountbike = new MountainBicycle(14);
        //MountainBicycle bike = new MountainBicycle(100, "tra", 1, 0 ,15);
        System.out.println("Mountbike features: " + mountbike.getSeatHeight());
        mountbike.changeGear();
        mountbike.move();
        mountbike.speedUp(1);
        mountbike.stop();
        mountbike.applyBrake(1);

        RoadBicycle roadBike = new RoadBicycle(0, 0, 111);
        System.out.println("Roadbike feature: " + roadBike.getRudderDepth());
        roadBike.changeGear();
        roadBike.move();
        roadBike.speedUp(2);
        roadBike.stop();
        roadBike.applyBrake(10);

        Vehicle car = new Car(300 , "tesla", "sedan", "auto");
        System.out.println("Our car is: " + car.getModel() + " type " + Car.carType + " transmission " + Car.transmission);
        car.speedUp(310);
        car.applyBrake(15);

        System.out.println("Comparing: ");
        Vehicle helicopt1 = new Helicopter(200, "Appache", 7, 1000, 100);
        Vehicle helicopt2 = new Helicopter(200, "Appache", 7, 1000, 100);
        System.out.println("Is helicopt1 equal helicopt2: " + helicopt1.equals(helicopt2));
        boolean equal = helicopt1 == helicopt2;
        System.out.println("Is helicopt1 == helicopt2: " + equal);

        Vehicle car2 = new Car(300 , "tesla", "sedan", "auto");
        Car car3 = new Car(100, "lada", "coupe", "mechanix");
        System.out.println("Is car equal car2: " + helicopt1.equals(helicopt2));
        boolean equal2 = helicopt1 == helicopt2;
        System.out.println("Is car == car2: " + equal2);

        System.out.println("");
        System.out.println("Interfaces:");

        //Interfaces
        roadBike.buyBike();
        roadBike.buyBike(2);
        roadBike.navigation();
        BicycleInterface.bikeInfo();
        VehicleInterface.navigationDescription();
        car3.buyNavigator();
        car3.navigationPrice();
        car3.navigationPrice(7);
    }
}
