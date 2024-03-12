public class task3 {
    public task3() {
        double[] array = {1.5, 2.7, 3.9, 4.3, 5.1};

        double sum = 0;
        for (double v : array) {
            sum += v;
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
