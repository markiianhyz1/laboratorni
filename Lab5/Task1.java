import java.util.Scanner;

public class Task1 implements Interface {

    public void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину бічної сторони ромба:");
        double side = scanner.nextDouble();

        System.out.println("Введіть висоту ромба:");
        double height = scanner.nextDouble();

        double area = calculateRhombusArea(side, height);

        // Перевірка введення
        if (Double.isNaN(area) || Double.isInfinite(area)) {
            System.out.println("Невірні дані!");
            return;
        }

        // Форматування виведення
        String formattedArea = String.format("%.2f", area);

        System.out.println("Площа ромба: " + formattedArea);

        scanner.close();
    }

    public double calculateRhombusArea(double side, double height) {
        return side * height;
    }
}
