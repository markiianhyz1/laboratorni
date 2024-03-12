public class task1 {
    public task1() {
        int[] numbers = new int[50];
        int currentNumber = 0; // Початкове парне число
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = currentNumber;
            currentNumber += 2;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }


}
