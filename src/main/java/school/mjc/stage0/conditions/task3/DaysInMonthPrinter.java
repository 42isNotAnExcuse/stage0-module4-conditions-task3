package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month <= 0) {
            System.out.println("wrong number!");
        } else if (month == 6) {
            System.out.println(30);
        } else {
            System.out.println(28);
        }
    }
}
