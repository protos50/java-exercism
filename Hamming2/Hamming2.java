package Hamming2;

/*
 * Calculate the Hamming Distance between two DNA strands.

Your body is made up of cells that contain DNA. Those cells regularly wear out and need
replacing, which they achieve by dividing into daughter cells. In fact, the average human
body experiences about 10 quadrillion cell divisions in a lifetime!

When cells divide, their DNA replicates too. Sometimes during this process mistakes happen
and single pieces of DNA get encoded with the incorrect information. If we compare two
strands of DNA and count the differences between them we can see how many mistakes occurred.
This is known as the "Hamming Distance".

We read DNA using the letters C,A,G and T. Two strands might look like this:

GAGCCTACTAACGGGATfoo
CATCGTAATGACGGCCT
^ ^ ^  ^ ^    ^^

They have 7 differences, and therefore the Hamming Distance is 7.

The Hamming Distance is useful for lots of things in science, not just biology, so it's a
nice phrase to be familiar with :)

The Hamming distance is only defined for sequences of equal length, so an attempt to
calculate it between sequences of different lengths should not work. The general handling
of this situation (e.g., raising an exception vs returning a special value) may differ
between languages.

This is the first exercise with tests that require you to throw an Exception. Exceptions are
typically thrown to indicate that a program has encountered an unexpected input or state.

We use JUnit's ExpectedException rule throughout the track to verify that the exceptions you
 throw are:

    instances of a specified Java type;
    (optionally) initialized with a specified message.


 */

public class Hamming2 {
    private String leftStrand,
            rightStrand;

    public Hamming2(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            this.setLeftStrand(leftStrand);
            this.setRightStrand(rightStrand);
        } else {
            this.checkExceptions(leftStrand, rightStrand);
        }

    }

    private void setLeftStrand(String leftStrand) {
        this.leftStrand = leftStrand;
    }

    public String getLeftStrand() {
        return this.leftStrand;
    }

    private void setRightStrand(String rightStrand) {
        this.rightStrand = rightStrand;
    }

    public String getRightStrand() {
        return this.rightStrand;
    }

    /*
     * ("leftStrand and rightStrand must be of equal length.");
     * ("left strand must not be empty.");
     * ("right strand must not be empty.");
     * ("leftStrand and rightStrand must be of equal length.");
     * 
     */
    public void checkExceptions(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int hammingDistance = 0;

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }
}
