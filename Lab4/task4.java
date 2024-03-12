public class task4 {
    public task4() {
        double[] array = {1.5, 2.7, 3.9, 4.3, 5.1};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] *= -1;
            }
        }

        for (double v : array) {
            System.out.println(v);
        }
    }
}
