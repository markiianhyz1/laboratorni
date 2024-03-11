import java.util.Scanner;

public class Lab2task4 {
    public Lab2task4 () {
        Scanner scanner = new Scanner(System.in);

        // Введення значення x з клавіатури
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double result1; // Оголошення змінної result1

        // Перевірка умови і обчислення результату для f(x) = x^2 + 1
        if (x > 0) {
            result1 = Math.pow(x, 2) + 1;
            System.out.println("Результат для f(x) = x^2 + 1: " + result1);
        } else if (x == 0) {
            result1 = 1; // Результат для x = 0
            System.out.println("Результат для f(x) = x^2 + 1: " + result1);
        } else {
            result1 = Math.pow(x, 2) - 1;
            System.out.println("Результат для f(x) = x^2 + 1: " + result1);
        }

        // Перевірка умови і обчислення результату для кореня в степені 5 з x + 5
        if (x >= 0 && x <= 5) {
            double result2 = Math.pow(x, 1.0 / 5) + 5; // Корінь в степені 5 з x + 5
            System.out.println("Результат для кореня в степені 5 з x + 5: " + result2);
        } else {
            System.out.println("x не задовольняє умову 0 <= x <= 5, обчислення не виконано.");
        }

        // Перевірка умови і обчислення результату для -x + e^x, x > 5
        if (x > 5) {
            double result3 = -x + Math.exp(x); // -x + e^x
            System.out.println("Результат для -x + e^x, x > 5: " + result3);
        } else {
            System.out.println("x не задовольняє умову x > 5, обчислення не виконано.");
        }

        scanner.close();
    }
}
