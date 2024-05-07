import java.util.Scanner;

public class Task2 implements Printable {

    @Override
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.println("Введіть номер телефону:");
        String number = scanner.nextLine();

        System.out.println("Введіть модель телефону:");
        String model = scanner.nextLine();

        System.out.println("Введіть вагу телефону (г):");
        int weight = scanner.nextInt();

        // Створення екземпляра класу Phone
        Phone phone = new Phone(number, model, weight);

        // Вивід інформації
        System.out.println("Інформація про телефон:");
        System.out.println(phone.toString());

        //scanner.close();
    }

    public class Phone {

        private String number;
        private String model;
        private int weight;

        public Phone(String number, String model, int weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Номер: " + number + ", Модель: " + model + ", Вага: " + weight + " г";
        }


    }
}
