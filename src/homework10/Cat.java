package homework10;

public class Cat extends Animal{

    private int age;

    public Cat (String food, String location, int age){
        super(food, location);
        this.age = age;
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void makeNoise() {
        System.out.println("Cat make noise may-may");
    }

    public int getAge() {
        return age;
    }

}
