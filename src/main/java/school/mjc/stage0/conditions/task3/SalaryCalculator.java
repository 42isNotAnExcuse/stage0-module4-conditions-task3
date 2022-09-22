package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int percent;

        if (salary <= 10000 && salary > 0) {
            percent = 15;
            System.out.println((double) salary * (100 - percent) / 100);
        } else if (salary > 10000 && salary <= 20000) {
            percent = 18;
            System.out.println((double) salary * (100 - percent) / 100);
        } else if (salary > 20000) {
            percent = 20;
            System.out.println((double) salary * (100 - percent) / 100);
        } else {
            System.out.println("wrong input!");
        }
    }
}
