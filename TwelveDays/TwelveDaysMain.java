package TwelveDays;

public class TwelveDaysMain {
    public static void main(String[] args) {
        TwelveDays twelveDays = new TwelveDays();

        System.out.println("\n" + twelveDays.verse(12)  + "\n\n");
        System.out.println(twelveDays.verses(1, 3));
        System.out.println(twelveDays.sing());
    }
}
