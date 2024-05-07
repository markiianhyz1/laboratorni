import java.util.Scanner;

public class Task3 implements Interface {
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір масиву:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        printArray(array);

        scanner.close();
    }

    public void printArray(int[] arr) {
        System.out.print("Масив: [");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
