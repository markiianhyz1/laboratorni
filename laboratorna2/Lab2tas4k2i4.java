import java.util.Scanner;

public class Lab2tas4k2i4 {
    public Lab2tas4k2i4() {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Привітання");
            System.out.println("2. Запрошення до роботи на комп'ютері");
            System.out.println("3. Завершити роботу");
            System.out.print("Виберіть опцію: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Привітання!");
                    break;
                case 2:
                    System.out.println("Запрошуємо до роботи на комп'ютері!");
                    break;
                case 3:
                    System.out.println("Дякую за використання програми. До побачення!");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
