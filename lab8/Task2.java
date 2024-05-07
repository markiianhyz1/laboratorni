import java.io.*;
import java.util.Scanner;

public class Task2 implements Printable{
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я файлу: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Файл не існує: " + fileName);
            return;
        }

        try (FileReader reader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    System.out.println(number + " ");
                }
               // System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Помилка читання з файлу: " + e.getMessage());
        }
    }
}
