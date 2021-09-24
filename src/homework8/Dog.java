package homework8;

public class Dog {

    private String name;
    private static int dogsPopulation;
    private static int dogsInClinic;


    public Dog (String name) {
        this.name = name;
    }

    public Dog() {
        name = "Default dog";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDogsInClinic() {
        return dogsInClinic;
    }

    public static void setDogsInClinic(int dogsInClinic) {
        Dog.dogsInClinic = dogsInClinic;
    }

    public static int getDogsPopulation() {
        return dogsPopulation;
    }

    public static void countDodsInClinic() {
        dogsPopulation = 900000000;
        dogsInClinic++;
        System.out.println("We have " + dogsInClinic + " dog in the clinic now. But in the world we have " + dogsPopulation + " dogs.");
    }

}
