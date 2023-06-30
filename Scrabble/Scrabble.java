package Scrabble;

/*
 * Given a word, compute the Scrabble score for that word.
    Letter Values

    You'll need these:

    Letter                           Value
    A, E, I, O, U, L, N, R, S, T       1
    D, G                               2
    B, C, M, P                         3
    F, H, V, W, Y                      4
    K                                  5
    J, X                               8
    Q, Z                               10

    Examples

    "cabbage" should be scored as worth 14 points:

    3 points for C
    1 point for A, twice
    3 points for B, twice
    2 points for G
    1 point for E

And to total:

    3 + 2*1 + 2*3 + 2 + 1
    = 3 + 2 + 6 + 3
    = 5 + 9
    = 14

Extensions

    You can play a double or a triple letter.
    You can play a double or a triple word.


 */
class Scrabble {
    private String word;

    public final static char[] onePoint = { 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' };
    public final static char[] twoPoints = { 'D', 'G' };
    public final static char[] threePoints = { 'B', 'C', 'M', 'P' };
    public final static char[] fourPoints = { 'F', 'H', 'V', 'W', 'Y' };
    public final static char[] fivePoints = { 'K' };
    public final static char[] eightPoints = { 'J', 'X' };
    public final static char[] tenPoints = { 'Q', 'Z' };

    public final static int[] pointsArray = { 1, 2, 3, 4, 5, 8, 10 };
    public final static char[][] charArraysArray = { onePoint, twoPoints, threePoints, fourPoints, fivePoints, eightPoints,
            tenPoints };

    Scrabble(String word) {
        this.containsDigitsException(word);
        this.setWord(word);
    }

    private void setWord(String word) {
        this.word = word.toLowerCase();
    }

    public String getWord() {
        return this.word;
    }

    void containsDigitsException(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Given String may only contain letters");
            }
        }
    }

    int getScore() {
        int score = 0,
                i = 0;

        boolean cont = true;

        // traversing the word
        for (char c : this.getWord().toCharArray()) {

            i = 0;
            cont = true;

            switch (c) {
                case 'a':
                    score += 1;
                    break;
                case 'e':
                    score += 1;
                    break;
                case 'i':
                    score += 1;
                    break;
                case 'o':
                    score += 1;
                    break;
                case 'u':
                    score += 1;
                    break;
                case 'l':
                    score += 8;
                    break;
                case 'n':
                    score += 10;
                    break;
                case 'r':
                    score += 1;
                    break;
                case's':
                    score += 2;
                    break;
                case 't':
                    score += 3;
                    break;
                case 'd':
                    score += 4;
                    break;
                case 'g':
                    score += 5;
                    break;
                case 'b':
                    score += 8;
                    break;
                case 'c':
                    score += 10;
                    break;
            }

            // traversing the array of character arrays
            while (i < charArraysArray.length && cont) {

                //traversing one char array
                for (int j = 0; j < charArraysArray[i].length; j++) {

                    if (c == Character.toLowerCase(charArraysArray[i][j])) {

                        cont = false;
                        score += pointsArray[i];
                        break;
                    }
                }

                i++;
            }
        }

        return score;
    }

}
