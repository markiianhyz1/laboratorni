import java.util.Scanner;
public class task5 {
    public task5() {
        Scanner scanner = new Scanner(System.in);

        // Введення границ діапазону
        System.out.print("Введіть початок діапазону: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінець діапазону: ");
        double end = scanner.nextDouble();

        double step = 0.1;
        int count = 0;

        // Перетворення функції в код та перевірка належності діапазону
        for (double x = start; x <= end; x += step) {
            double y = 0.1 * Math.pow(x, 2) - x * Math.cos(x);
            if (y >= start && y <= end) {
                count++;
                System.out.println("f(" + x + ") = " + y);
            }
        }

        // Виведення кількості значень функції, що потрапляють в діапазон
        if (count == 0) {
            System.out.println("Значень функції в заданому діапазоні немає.");
        } else {
            System.out.println("Кількість значень функції в заданому діапазоні: " + count);
        }

        scanner.close();
    }
}
