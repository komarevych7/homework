package homework10;

public class Dog extends Animal{

    private String breed;

    public Dog (String food, String location, String breed){
        super(food, location);
        this.breed = breed;
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }

    public void makeNoise() {
        System.out.println("Dog make noise gav-gav");
    }

    public String getBreed() {
        return breed;
    }

}
