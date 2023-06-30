package DifferenceOfSquaresCalculator;

/*
 * Find the difference between the square of the sum and the sum of the squares of the
 *  first N natural numbers.

    The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.

    The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.

    Hence the difference between the square of the sum of the first ten natural numbers and
     the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.

    You are not expected to discover an efficient solution to this yourself from first principles; research is allowed, indeed, encouraged. Finding the best algorithm for the problem is a key skill in software engineering.

 */
public class DifferenceOfSquaresCalculator {
    
    // ( ( n * (n + 1) ) / 2 ) ^ 2; 
    int computeSquareOfSumTo(int input) {
        return (int) Math.pow((int) sumNTerms(input), 2);
    }

    int sumNTerms(int n) {
        return ( ( n * (n + 1) ) / 2 );
    }

    // ( n * ( (2 * n) + 1 ) * (n + 1) ) / 6
    int computeSumOfSquaresTo(int input) {
        return  ( input * ( (2 * input) + 1 ) * (input + 1) ) / 6 ;
    }

    int computeDifferenceOfSquares(int input) {
        return (computeSquareOfSumTo(input) - computeSumOfSquaresTo(input));
    }
}
