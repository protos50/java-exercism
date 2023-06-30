package LargestSeriesProductCalculator;

/*
 * Given a string of digits, calculate the largest product for a contiguous substring
 *  of digits of length n.

    For example, for the input '1027839564', the largest product for a series of 3 digits
     is 270 (9 * 5 * 6), and the largest product for a series of 5 digits is 7560 
     (7 * 8 * 3 * 9 * 5).

    Note that these series are only required to occupy adjacent positions in the input;
     the digits need not be numerically consecutive.

    For the input '73167176531330624919225119674426574742355349194934', the largest product
     for a series of 6 digits is 23520.

 */
class LargestSeriesProductCalculator {
    private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {

        this.containsNotDigitsException(inputNumber);

        this.setInputNumber(inputNumber);
    }

    private void setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getInputNumber() {
        return this.inputNumber;
    }

    // 1027839564
    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > this.getInputNumber().length()) {
            throw new IllegalArgumentException(
                    "Series length must be less than or equal to the length of the string to search.");
        }

        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        return calculateLargestProduct(numberOfDigits);
    }

    long calculateLargestProduct(int numberOfDigits) {
        long largestProduct = 0,
                currentProduct = 1;

        for (int i = 0; i <= this.getInputNumber().length() - numberOfDigits; i++) {
            currentProduct = 1;

            for (int j = 0; j < numberOfDigits; j++) {
                char c = this.getInputNumber().charAt(i + j);
                currentProduct *= Character.getNumericValue(c);
            }
            largestProduct = Math.max(largestProduct, currentProduct);
        }

        return largestProduct;
    }

    void containsNotDigitsException(String inputNumber) {
        for (char c : inputNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("String to search may only contain digits.");

            }

        }
    }
}
