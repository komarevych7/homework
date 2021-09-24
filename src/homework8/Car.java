package homework8;

import java.util.Objects;

public class Car {

    private String manufacturer;
    private int manufactureYear;

    public Car (String manufacturer, int manufactureYear) {
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufactureYear == car.manufactureYear && manufacturer.equals(car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, manufactureYear);
    }
}
