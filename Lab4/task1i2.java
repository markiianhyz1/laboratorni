public class task1i2 {
    public task1i2() {
        int[] numbers = new int[50];
        int currentNumber = 1; // Початкове парне число
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = currentNumber;
            currentNumber += 2;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}