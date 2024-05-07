import java.util.Scanner;
public class Task2 implements Interface {
    public void Start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();

        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();

        System.out.println("Введіть третє число:");
        int num3 = scanner.nextInt();

        int min = findMin(num1, num2, num3);

        System.out.println("Найменше число: " + min);

        scanner.close();
            }

            public int findMin(int num1, int num2, int num3) {
                int min = num1;

                if (num2 < min) {
                    min = num2;
                }
                if (num3 < min) {
                    min = num3;
                }

                return min;
            }
        }
