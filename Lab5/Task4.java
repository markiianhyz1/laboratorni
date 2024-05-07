import java.util.Scanner;

public class Task4 implements Interface {
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір масиву:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = findMax(array);
        System.out.println("Найбільше число в масиві: " + max);

        scanner.close();
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
