import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task1 implements Printable {
    private static class Driver {
        private String name;
        private int age;
        private int experience;

        public Driver(String name, int age, int experience) {
            this.name = name;
            this.age = age;
            this.experience = experience;
        }

        public void increaseExperience() {
            this.experience++;
        }

        public String getName() {
            return this.name;
        }

        public int getExperience() {
            return this.experience;
        }

        public int getAge() {
            return this.age;
        }
    }

    private static class Car {
        private String brand;
        private double enginePower;
        private Driver driver;
        private double price;
        private int year;

        public Car(String brand, double enginePower, Driver driver, double price, int year) {
            this.brand = brand;
            this.enginePower = enginePower;
            this.driver = driver;
            this.price = price;
            this.year = year;
        }

        public void repairEngine() {
            this.enginePower *= 1.1;
        }

        public void hireDriver(Driver driver) {
            this.driver = driver;
        }

        public void increasePowerAndPrice() {
            this.enginePower *= 1.1;
            this.price *= 1.05;
        }

        public Driver getDriver() {
            return this.driver;
        }

        public String getBrand() {
            return this.brand;
        }
    }

    private static class Helper {
        public static Car getRandomCar(List<Car> cars) {
            int randomIndex = new Random().nextInt(cars.size());
            return cars.get(randomIndex);
        }

        public static void printCarDeparture(Car car) {
            System.out.println("Автомобіль марки " + car.getBrand() + " з водієм " + car.getDriver().getName() + " виїхав за вами");
        }

        public static void printDriverArrival(Car car) {
            System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
        }
    }

    @Override
    public void Start() {
        List<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Створення автомобілів
        for (int i = 0; i < 2; i++) {
            String driverName = "";
            while (true) {
                System.out.println("Введіть ім'я водія:");
                driverName = scanner.nextLine();
                if (driverName.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!driverName.matches("[a-zA-Z]+")) {
                    System.out.println("Ім'я водія повинно містити тільки букви. Будь ласка, спробуйте ще раз.");
                } else {
                    break;
                }
            }

            int driverAge = 0;
            while (true) {
                System.out.println("Введіть вік водія:");
                String ageInput = scanner.nextLine();
                if (ageInput.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!ageInput.matches("\\d+")) {
                    System.out.println("Вік водія повинен бути числом. Будь ласка, спробуйте ще раз.");
                } else {
                    driverAge = Integer.parseInt(ageInput);
                    break;
                }
            }

            int driverExperience = 0;
            while (true) {
                System.out.println("Введіть досвід водія:");
                String experienceInput = scanner.nextLine();
                if (experienceInput.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!experienceInput.matches("\\d+")) {
                    System.out.println("Досвід водія повинен бути числом. Будь ласка, спробуйте ще раз.");
                } else {
                    driverExperience = Integer.parseInt(experienceInput);
                    break;
                }
            }

            Driver driver = new Driver(driverName, driverAge, driverExperience);

            String carBrand = "";
            while (true) {
                System.out.println("Введіть марку автомобіля:");
                carBrand = scanner.nextLine();
                if (carBrand.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!carBrand.matches("[a-zA-Z]+")) {
                    System.out.println("Марка автомобіля повинна містити тільки букви. Будь ласка, спробуйте ще раз.");
                } else {
                    break;
                }
            }

            double enginePower = 0;
            while (true) {
                System.out.println("Введіть потужність двигуна:");
                String powerInput = scanner.nextLine();
                if (powerInput.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!powerInput.matches("\\d+(\\.\\d+)?")) {
                    System.out.println("Потужність двигуна повинна бути числом. Будь ласка, спробуйте ще раз.");
                } else {
                    enginePower = Double.parseDouble(powerInput);
                    break;
                }
            }

            double price = 0;
            while (true) {
                System.out.println("Введіть ціну автомобіля:");
                String priceInput = scanner.nextLine();
                if (priceInput.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!priceInput.matches("\\d+(\\.\\d+)?")) {
                    System.out.println("Ціна автомобіля повинна бути числом. Будь ласка, спробуйте ще раз.");
                } else {
                    price = Double.parseDouble(priceInput);
                    break;
                }
            }

            int year = 0;
            while (true) {
                System.out.println("Введіть рік випуску автомобіля:");
                String yearInput = scanner.nextLine();
                if (yearInput.equals("0")) {
                    System.out.println("Вихід з програми");
                    return;
                } else if (!yearInput.matches("\\d+")) {
                    System.out.println("Рік випуску автомобіля повинен бути числом. Будь ласка, спробуйте ще раз.");
                } else {
                    year = Integer.parseInt(yearInput);
                    break;
                }
            }

            Car car = new Car(carBrand, enginePower, driver, price, year);
            cars.add(car);
        }

        // Головний цикл програми
        while (true) {
            System.out.println("Введіть команду (call, repair, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "call":
                    Car car = Helper.getRandomCar(cars);
                    Helper.printCarDeparture(car);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Helper.printDriverArrival(car);
                    break;
                case "repair":
                    for (Car carToRepair : cars) {
                        carToRepair.repairEngine();
                    }
                    System.out.println("Всі автомобілі відремонтовані");
                    break;
                case "exit":
                    System.out.println("Вихід з програми");
                    return;
                default:
                    System.out.println("Невідома команда");
            }
        }
    }
}
