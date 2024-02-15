public class Main {
    public static void main(String[] args) {
        User user1 = new User(32, 18, "Іван", "Герасимів", 75, 173);
        User user2 = new User(45, 29, "Олег", "Корчинський", 91, 181);

        int totalAge = user1.age + user2.age;
        double totalWeight = user1.weight + user2.weight;
        double totalHeight = user1.height + user2.height;

        System.out.println("Сумарний вік: " + totalAge);
        System.out.println("Сумарна вага: " + totalWeight);
        System.out.println("Сумарний зріст: " + totalHeight);
    }
}
