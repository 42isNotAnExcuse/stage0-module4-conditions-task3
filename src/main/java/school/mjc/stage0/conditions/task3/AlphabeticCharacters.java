package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!(character > 64 && character < 123)) {
            System.out.println("wrong alphabet!");
        } else if (!(character % 2 == 0)) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
