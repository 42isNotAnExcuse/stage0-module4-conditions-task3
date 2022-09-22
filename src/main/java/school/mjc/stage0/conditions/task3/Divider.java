package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        boolean remainder = false;

        if (number <= 0) {
            System.out.println("cannot divide by zero");
            return;
        }
        remainder = (number % 5) + (number % 11) == 0;
        if (remainder) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }
}
