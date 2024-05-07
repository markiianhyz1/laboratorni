import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число (1-4):");
        int number;

        try {
            number = sc.nextInt();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Помилка: Введено недостатньо даних. Завершення програми.");
            sc.next();
            return;
        }

        Interface Inter = null;

        while (number >= 1 && number <= 4) {
            Inter = switch (number) {
                case 1 -> new Task1();
                case 2 -> new Task2();
                case 3 -> new Task3();
                case 4 -> new Task4();
                default -> Inter;
            };

            Inter.Start();
            System.out.println("Введіть нове число ");
            try {
                number = sc.nextInt();
            } catch (java.util.NoSuchElementException e) {
                System.out.println("Помилка: Введено недостатньо даних. Завершення програми.");
                //sc.next();
                return;
            }
        }
        System.out.println("Дякуємо за використання програми!");
    }
}
