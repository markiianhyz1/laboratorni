import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String continueChoice;

        do {
            System.out.println("Введіть число (0-2):");

            while (true) {
                if (sc.hasNextInt()) {
                    try {
                        number = sc.nextInt();
                        if (number == 0) {
                            System.out.println("Програма завершена.");
                            return;
                        } else if (number >= 1 && number <= 2) {
                            break;
                        } else {
                            System.out.println("Помилка: Число повинне бути в діапазоні від 0 до 2.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Помилка: Введено не число. Спробуйте ще раз:");
                    }
                } else {
                    System.out.println("Помилка: Введіть число (0-2).");
                    if (sc.hasNext()) {
                        sc.next(); // Очистка буфера (необов'язково)
                    }
                }
            }

            Printable Inter = null;

            Inter = switch (number) {
               case 1 -> new Task1();
               case 2 -> new Task2();
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
