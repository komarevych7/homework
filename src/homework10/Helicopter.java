package homework10;

import java.util.Objects;

public class Helicopter extends Vehicle{
    public int amountOfPassengers, maxHeight, tankSize;

    public Helicopter(int speed, String model, int amountOfPassengers, int maxHeight, int tankSize){
        super(speed, model);
        this.amountOfPassengers = amountOfPassengers;
        this.maxHeight = maxHeight;
        this.tankSize = tankSize;
    }

    public void move(){
        System.out.println("Helicopter move");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "amountOfPassengers=" + amountOfPassengers +
                ", maxHeight=" + maxHeight +
                ", tankSize=" + tankSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return amountOfPassengers == that.amountOfPassengers && maxHeight == that.maxHeight && tankSize == that.tankSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPassengers, maxHeight, tankSize);
    }
}
