public class Car {
    int horsepower;
    double engineVolume;
    String brand;
    String model;
    String color;
    boolean isAutomatic;
    boolean isElectric;
    int year;
    String fuelType;
    boolean isFourWheelDrive;

    public Car(int horsepower, double engineVolume, String brand, String model, String color, boolean isAutomatic, boolean isElectric, int year, String fuelType, boolean isFourWheelDrive) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.isElectric = isElectric;
        this.year = year;
        this.fuelType = fuelType;
        this.isFourWheelDrive = isFourWheelDrive;
    }
}
