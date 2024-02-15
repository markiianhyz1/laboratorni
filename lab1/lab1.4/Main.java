// File: Main.java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(150, 2.0, "Ford", "Fiesta", "Blue", true, false, 2019, "Petrol", false);
        Car car2 = new Car(200, 2.5, "Chevrolet", "Camaro", "Red", true, false, 2020, "Petrol", false);
        Car car3 = new Car(180, 2.2, "Tesla", "Model 3", "White", true, true, 2018, "Electric", false);
        Car car4 = new Car(170, 2.3, "BMW", "5 Series", "Silver", true, false, 2017, "Petrol", false);
        Car car5 = new Car(190, 2.4, "Audi", "A6", "Black", true, false, 2021, "Diesel", true);
        Car car6 = new Car(160, 2.1, "Mercedes-Benz", "E-Class", "Gray", true, false, 2019, "Diesel", true);
        Car car7 = new Car(210, 2.6, "Toyota", "Camry", "Green", true, false, 2020, "Petrol", true);
        Car car8 = new Car(220, 2.7, "Honda", "Accord", "Yellow", true, false, 2018, "Hybrid", true);
        Car car9 = new Car(230, 2.8, "Volkswagen", "Passat", "Orange", true, false, 2017, "Petrol", true);
        Car car10 = new Car(240, 2.9, "Hyundai", "Sonata", "Purple", true, false, 2021, "Petrol", true);

        double totalEngineVolume = car1.engineVolume + car2.engineVolume + car3.engineVolume + car4.engineVolume + car5.engineVolume
                + car6.engineVolume + car7.engineVolume + car8.engineVolume + car9.engineVolume + car10.engineVolume;

        int totalHorsepower = car1.horsepower + car2.horsepower + car3.horsepower + car4.horsepower + car5.horsepower
                + car6.horsepower + car7.horsepower + car8.horsepower + car9.horsepower + car10.horsepower;

        System.out.println("Сумарний об'єм двигунів: " + totalEngineVolume);
        System.out.println("Сумарна потужність: " + totalHorsepower);
    }
}
