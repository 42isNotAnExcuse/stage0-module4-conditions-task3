package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        // Print the name of a season by number of a month(e.g. if number is 6 => "Summer").
        // Number of the month will be coming from parameter of the method
        // (if number is not a month number e.g. 13 => print: "wrong number!" ):

        String season; // season

        if (month == 1 || month == 2 || month == 12) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        } else {
            season = "wrong number!";
        }
        System.out.println(season);
    }
}
