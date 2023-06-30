package IsogramChecker;

/*
 * Determine if a word or phrase is an isogram.

    An isogram (also known as a "nonpattern word") is a word or phrase without a 
    repeating letter, however spaces and hyphens are allowed to 
    appear multiple times.

    Examples of isograms:

        lumberjacks
        background
        downstream
        six-year-old

    The word isograms, however, is not an isogram, because the s repeats.

 */
class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean isIsogram = true;
        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length() - 1 && isIsogram; i++) {
            if (phrase.charAt(i) == '-' || phrase.charAt(i) == ' ') {
                continue;
            }

            for (int k = i + 1; k < phrase.length(); k++) {
                if (phrase.charAt(i) == phrase.charAt(k)) {
                    isIsogram = false;
                    break;
                } 

            }

        }

        return isIsogram;
    }
}
