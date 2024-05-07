import java.util.Scanner;

public class Task4 implements Printable {

    @Override
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Введення типу автомобіля
        System.out.println("Введіть тип автомобіля (sedan/truck):");
        while (true) {
            if (scanner.hasNext()) break;
            // Очікувати введення користувача
        }
        String type = scanner.nextLine().toLowerCase();

        Car car = null;

        // Перевірка введеного типу
        try {
            if (type.equals("sedan")) {
                car = new Sedan(scanner);
            } else if (type.equals("truck")) {
                car = new Truck(scanner);
            } else {
                throw new IllegalArgumentException("Невідомий тип автомобіля!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Допустимі типи: sedan, truck");
            return;
        }

        // Вивід інформації
        System.out.println(car.toString());
        car.gas();
        car.brake();
        //scanner.close();
    }



    public class Car {

        protected String model;
        protected String color;
        protected int maxSpeed;

        public Car(Scanner scanner) {
            // Введення даних
            System.out.println("Введіть модель автомобіля:");
            model = scanner.nextLine();

            System.out.println("Введіть колір автомобіля:");
            color = scanner.nextLine();

            System.out.println("Введіть максимальну швидкість (км/год):");
            maxSpeed = scanner.nextInt();
        }

        public void gas() {
            System.out.println("Газуємо!");
        }

        public void brake() {
            System.out.println("Гальмуємо!");
        }

        @Override
        public String toString() {
            return "**Інформація про автомобіль:**\n\n" +
                    "Модель: " + model + "\n" +
                    "Колір: " + color + "\n" +
                    "Максимальна швидкість: " + maxSpeed + " км/год";
        }
    }

    public class Sedan extends Car {

        public Sedan(Scanner scanner) {
            super(scanner);
        }

        @Override
        public void brake() {
            System.out.println("Седан гальмує плавно!");
        }
    }

    public class Truck extends Car {

        public Truck(Scanner scanner) {
            super(scanner);
        }

        @Override
        public void brake() {
            System.out.println("Грузовик гальмує з інерцією!");
        }
    }
}
