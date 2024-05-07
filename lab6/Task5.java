import java.util.Scanner;

public class Task5 implements Printable {

    @Override
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.println("Введіть катет a: ");
        double a = scanner.nextDouble();
        System.out.println("Введіть катет b: ");
        double b = scanner.nextDouble();

        // Створення екземпляра класу Triangle
        Triangle triangle = new Triangle(a, b);

        // Вивід інформації
        System.out.println("Катет a: " + triangle.getA());
        System.out.println("Катет b: " + triangle.getB());
        System.out.println("Гіпотенуза: " + triangle.getHypotenuse());

        System.out.println("sin(A): " + triangle.getSinA());
        System.out.println("cos(A): " + triangle.getCosA());
        System.out.println("tan(A): " + triangle.getTanA());

        System.out.println("sin(B): " + triangle.getSinB());
        System.out.println("cos(B): " + triangle.getCosB());
        System.out.println("tan(B): " + triangle.getTanB());

        //scanner.close();
    }


    // Клас Triangle
    public  class Triangle {

        private final double a;
        private final double b;

        public Triangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getHypotenuse() {
            return Math.sqrt(a * a + b * b);
        }

        public double getSinA() {
            return a / getHypotenuse();
        }

        public double getCosA() {
            return b / getHypotenuse();
        }

        public double getTanA() {
            return a / b;
        }

        public double getSinB() {
            return b / getHypotenuse();
        }

        public double getCosB() {
            return a / getHypotenuse();
        }

        public double getTanB() {
            return b / a;
        }
    }
}
