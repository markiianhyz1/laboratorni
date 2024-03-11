import java.util.Scanner;

public class Lab2task2 {
    public Lab2task2() {
        // Створення об'єкта Scanner для зчитування введених даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Введення значення x з клавіатури
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        // Обчислення та виведення значення функції f(x)
        double result = computeF(x);
        System.out.println("f(x) = " + result);

        // Закриття об'єкту Scanner
        scanner.close();
    }

    // Метод для обчислення значення функції f(x)
    public double computeF(double x) {
        if (x > 0) {
            return 2 * x + 1;
        } else if (x == 0) {
            return 0;
        } else {
            return Math.pow(x, 2) - 1;
        }
    }
}
