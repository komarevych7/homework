package homework10;

public abstract class Animal {

    private String food, location;

    public Animal (String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void makeNoise() {
        System.out.println("Animal make voice");
    }

    public void sleep() {
        System.out.println("Sweet dreams animal. Zzzzzz");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
