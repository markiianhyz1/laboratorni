import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String continueChoice;

        do {
            System.out.println("Введіть число (1-5):");

            while (true) {
                if (sc.hasNextInt()) {
                    try {
                        number = sc.nextInt();
                        if (number >= 1 && number <= 5) {
                            break;
                        } else {
                            System.out.println("Помилка: Число повинне бути в діапазоні від 1 до 5.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Помилка: Введено не число. Спробуйте ще раз:");
                    }
                } else {
                    System.out.println("Помилка: Введіть число (1-5).");
                    if (sc.hasNext()) {
                        sc.next(); // Очистка буфера (необов'язково)
                    }
                }
            }

            Printable Inter = null;

            Inter = switch (number) {
                case 1 -> new Task1();
                case 2 -> new Task2();
                case 3 -> new Task3();
                case 4 -> new Task4();
                case 5 -> new Task5();
                default -> Inter;
            };

            Inter.Start();

            System.out.println("Бажаєте продовжити виконання? (так/ні)");
            if (sc.hasNext()) { // Перевіряємо, чи є ще введення
                continueChoice = sc.next(); // Зчитуємо вибір користувача
            } else {
                continueChoice = "ні"; // Якщо введення закінчено, за замовчуванням вважаємо "ні"
            }

        } while (continueChoice.equalsIgnoreCase("так"));

        System.out.println("Програма завершена.");
    }
}
