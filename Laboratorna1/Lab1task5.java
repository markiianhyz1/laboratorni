public class Lab1task5 {

    public static void main(String[] args) {
        int number = 423;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Реверсоване число: " + reverse);
    }
}