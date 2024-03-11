import java.util.Scanner;
public class Lab2task3 {
    public Lab2task3 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) { // Перевірка, чи число двозначне
            if (number % 2 == 0) { // Перевірка, чи число парне
                System.out.println("Число " + number + " є двозначним і парним.");
            } else {
                System.out.println("Число " + number + " є двозначним, але не парним.");
            }
        } else {
            System.out.println("Число " + number + " не є двозначним.");
        }
    }
}
