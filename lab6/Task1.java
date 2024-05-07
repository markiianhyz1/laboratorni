import java.util.Scanner;

public class Task1 implements Printable {

    @Override
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.println("Введіть ваше ім'я:");
        String name = scanner.nextLine();

        System.out.println("Введіть ваш вік:");
        int age = scanner.nextInt();

        // Створення екземпляра класу Person
        Person person = new Person(name, age);

        // Вивід інформації
        System.out.println("Вітаю, " + person.getFullName() + "!");
        System.out.println("Ваш вік: " + person.getAge());

        // Автоматичне виконання дії
        person.move();
        person.talk();

        //scanner.close();
    }

    public static class Person {
        private final String fullName;
        private int age;

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public void move() {
            System.out.println(fullName + " рухається.");
        }

        public void talk() {
            System.out.println(fullName + " говорить.");
        }

        public String getFullName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
