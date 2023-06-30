package SqueakyClean;

import java.lang.Character;
/* 
 * In this exercise you will implement a partial set of utility routines to help a developer clean up
 *  SqueakyClean names.

    In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is 
    comprised of zero or more letters and underscores.

    In all cases the input string is guaranteed to be non-null. Note that the clean method should 
    treat an empty string as valid.

 */

class SqueakyClean {
    /*
     * TASK 1
     * Replace any spaces encountered with underscores
     * 
     * Implement the (static) SqueakyClean.clean() method to replace any spaces with
     * underscores.
     * This also applies to leading and trailing spaces.
     * 
     * SqueakyClean.clean("my   Id");
     * // => "my___Id"
     * 
    */

    /*
     * TASK 2
     * Replace control characters with the upper case string "CTRL"
     * 
     * Modify the (static) SqueakyClean.clean() method to replace control characters
     * with the upper case string "CTRL".
     * 
     * SqueakyClean.clean("my\0Id");
     * // => "myCTRLId",
    */


    /* TASK 3
    * Convert kebab-case to camelCase

        Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.

        SqueakyClean.clean("à-ḃç");
        // => "àḂç"

    */

    /* TASK 4
     * Omit characters that are not letters

        Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.

        SqueakyClean.clean("a1😀2😀3😀b");
        // => "ab"

    */

    /*
    * Omit Greek lower case letters

        Modify the (static) SqueakyClean.clean() method to omit any Greek letters in the range 'α' to 'ω'.

        SqueakyClean.clean("MyΟβιεγτFinder");
        // => "MyΟFinder"
    */
    static String clean(String identifier) {
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char charActualPosition = identifier.charAt(i);

            // isSpaceChar method is used for detecting spaces. It's a static method.
            if (Character.isSpaceChar(charActualPosition)) {
                str1.append("_");

            } else if (Character.isISOControl(charActualPosition)) {
                str1.append("CTRL");

            } else if (charActualPosition == '-') {
                i = i + 1;
                if (Character.isDigit(identifier.charAt(i))) {
                    continue;
                } else {
                    str1.append(Character.toUpperCase(identifier.charAt(i)));                    
                }

            } else if (charActualPosition <= 'ω' && charActualPosition >= 'α') {
                str1.append("");

            } else if (Character.isLetter(charActualPosition) == false) {
                str1.append("");

            } else {
                str1.append(charActualPosition);
            }

        }

        return str1.toString();
    }
}
