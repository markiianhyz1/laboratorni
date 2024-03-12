public class task2i3 {
    public task2i3() {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 0;
        while (i < numbers.length) {
            if (i % 2 != 0) {
                System.out.println(numbers[i]);
            }
            i++;
        }
    }
}
