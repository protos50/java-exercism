package Scrabble;

public class ScrabbleMain {
    public static void main(String[] args) {
        Scrabble scrabble1 = new Scrabble("cabbage");

        System.out.println("Score: " + scrabble1.getScore());   //score=14
    }
}
