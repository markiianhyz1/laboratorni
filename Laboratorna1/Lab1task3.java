public class Lab1task3 {


    public static void main(String[] args) {
        User user1 = new User(32, 18, "Іван", "Герасимів", 75, 173);
        User user2 = new User(45, 29, "Олег", "Корчинський", 91, 181);
        User user3 = new User(23, 23, "Іван", "Петров", 54, 167);
        User user4 = new User(25, 19, "Марія", "Коваленко", 57, 170);
        User user5 = new User(9, 12, "Олексій", "Сидоренко", 45, 165);
        User user6 = new User(27, 20, "Анастасія", "Іванова", 53, 169);
        User user7 = new User(51, 24, "Олег", "Васильчук", 60, 171);
        User user8 = new User(43, 42, "Павло", "Кузьменко", 81, 179);
        User user9 = new User(29, 27, "Анна", "Мельник", 71, 172);
        User user10 = new User(24, 31, "Юлія", "Лисенко", 110, 189);
        int totalAge = user1.age + user2.age;
        double totalWeight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight +
                user6.weight + user7.weight + user8.weight + user9.weight+ user10.weight;
        double totalHeight = user1.height + user2.height;

        System.out.println("Сумарний вік: " + totalAge);
        System.out.println("Сумарна вага: " + totalWeight);
        System.out.println("Сумарний зріст: " + totalHeight);
    }
}
