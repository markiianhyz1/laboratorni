public class task3 {
    public task3() {
        int hour = 0;
        int minute = 0;

        while (hour <= 2) {
            while (minute < 60) {
                System.out.println(hour + "h " + minute + "min");
                minute++;
            }
            hour++;
            minute = 0;
        }
    }
}
