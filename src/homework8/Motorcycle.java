package homework8;

public class Motorcycle {

    private String manufacturer;
    private int manufactureYear;

    public Motorcycle (String manufacturer, int manufactureYear) {
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
}
