import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 implements Printable {
    private static class PhoneBook {
        private final Map<String, String> phoneBook;

        public PhoneBook() {
            this.phoneBook = new HashMap<>();
        }

        public void addEntry(String lastName, String phoneNumber) {
            this.phoneBook.put(lastName, phoneNumber);
        }

        public String getPhoneNumber(String lastName) {
            return this.phoneBook.get(lastName);
        }

        public void removeEntry(String lastName) {
            this.phoneBook.remove(lastName);
        }

        public boolean containsKey(String lastName) {
            return this.phoneBook.containsKey(lastName);
        }

        public boolean containsValue(String phoneNumber) {
            return this.phoneBook.containsValue(phoneNumber);
        }

        public int size() {
            return this.phoneBook.size();
        }

        public void printPhoneBook() {
            for (Map.Entry<String, String> entry : this.phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public void findPhoneNumber(String lastName) {
            if (this.phoneBook.containsKey(lastName)) {
                System.out.println(lastName + " - " + this.phoneBook.get(lastName));
            } else {
                System.out.println("У книзі відсутній такий абонент");
            }
        }
    }

    @Override
    public void Start() {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть команду (add, remove, find, print, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Введіть прізвище:");
                    String lastName = scanner.nextLine();
                    if (!lastName.matches("[a-zA-Z]+")) {
                        System.out.println("Прізвище повинно містити тільки букви.");
                        break;
                    }
                    String phoneNumber;
                    do {
                        System.out.println("Введіть номер телефону:");
                        phoneNumber = scanner.nextLine();
                        if (phoneNumber.equals("0")) {
                            System.out.println("Вихід з програми");
                            return;
                        } else if (!phoneNumber.matches("\\d+")) {
                            System.out.println("Номер телефону повинен містити тільки цифри.");
                        } else {
                            phoneBook.addEntry(lastName, phoneNumber);
                            break;
                        }
                    } while (true);
                    break;
                case "remove":
                    System.out.println("Введіть прізвище:");
                    lastName = scanner.nextLine();
                    phoneBook.removeEntry(lastName);
                    break;
                case "find":
                    System.out.println("Введіть прізвище:");
                    lastName = scanner.nextLine();
                    phoneBook.findPhoneNumber(lastName);
                    break;
                case "print":
                    phoneBook.printPhoneBook();
                    break;
                case "exit":
                    System.out.println("Вихід з програми");
                    return;
                default:
                    System.out.println("Невідома команда");
            }
        }
    }
}
