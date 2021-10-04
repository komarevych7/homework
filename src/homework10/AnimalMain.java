package homework10;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Cat("wiskas", "kvartira", 4);
        Animal dog = new Dog ("bones", "budka", "korgi");
        Animal horse = new Horse("grass", "pole", true);
        Veterinar veterinar = new Veterinar();
        Animal[] animals = {cat, dog, horse};
        for (Animal animal: animals) {
            veterinar.treatAnimal(animal);
        }
    }
}
