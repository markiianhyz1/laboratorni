import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task1 implements Printable{
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я файлу: ");
        String fileName = scanner.nextLine();

        System.out.print("Введіть мінімальне значення діапазону: ");
        int min = scanner.nextInt();

        System.out.print("Введіть максимальне значення діапазону: ");
        int max = scanner.nextInt();

        System.out.print("Введіть кількість випадкових чисел: ");
        int count = scanner.nextInt();

        try (FileWriter writer = new FileWriter(fileName)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(max - min + 1) + min;
                writer.write(randomNumber + " ");
            }
        } catch (IOException e) {
            System.err.println("Помилка запису до файлу: " + e.getMessage());
        }

        System.out.println("Дані успішно записані до файлу: " + fileName);
    }
}
