package homework8;

public class AutoMarket {
    public static void main(String[] args) {
        Car hondaOldCar = new Car("Honda", 2020);
        Car hondaNewCar = new Car ("Honda", 2020);
        Motorcycle yamaha1Moto = new Motorcycle("Yamaha", 2020);
        Motorcycle yamaha2Moto = new Motorcycle("Yamaha", 2020);

        System.out.println("Compare honda with old engine and with new: " + (hondaNewCar == hondaNewCar));
        System.out.println("Compare again this cars by equal method: " + hondaNewCar.equals(hondaOldCar));

        System.out.println("Compare Yamaha 1 and Yamaha 2: " + (yamaha1Moto == yamaha2Moto));
        System.out.println("Compare again this motorcycles by equal method: " + yamaha1Moto.equals(yamaha2Moto));

    }
}
