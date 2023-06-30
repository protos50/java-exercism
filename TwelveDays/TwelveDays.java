package TwelveDays;

/*
 * Output the lyrics to 'The Twelve Days of Christmas'.

On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.

On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.

On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

 */
class TwelveDays {
    public final String [] ordinalNumberOfDays = {"first", "second", "third", "fourth", "fifth",
     "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    public final String [] cardinalNumber = {"one", "two", "three", "four", "five", "six",
     "seven", "eight", "nine", "ten", "eleven", "twelve"};

    public final String [] gifts = {" Drummers Drumming", " Pipers Piping",
        " Lords-a-Leaping", " Ladies Dancing", " Maids-a-Milking",
        " Swans-a-Swimming", " Geese-a-Laying", " Gold Rings", " Calling Birds",
        " French Hens", " Turtle Doves", " a Partridge in a Pear Tree.\n"};

    String verse(int verseNumber) {
        StringBuilder verse = new StringBuilder();

        if (verseNumber == 1) {
            verse.append(String.format("On the %s day of Christmas my true love gave to me:%s", ordinalNumberOfDays[verseNumber - 1], gifts[gifts.length - 1]));
        } else {
            verse.append(String.format("On the %s day of Christmas my true love gave to me: ", ordinalNumberOfDays[verseNumber - 1]));

            for (int i = verseNumber - 1; i > 0; i--) { 
                verse.append(cardinalNumber[i]);
                verse.append(gifts[gifts.length - (i + 1)] + ", ");
            }

            // last gift of each verse.
            verse.append(String.format("and%s", gifts[gifts.length - 1]));
        }

        return verse.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder verses = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            verses.append(String.format("%s\n", this.verse(i)));
        }

        // deleted last "\n"
        verses.deleteCharAt(verses.lastIndexOf("\n"));

        return verses.toString();
    }
    
    String sing() {
        return this.verses(1, 12);
    }
}
