package Grains;

import java.math.BigInteger;
 
/*
 *  Instructions

    Calculate the number of grains of wheat on a chessboard given that the number on each square
     doubles.

    There once was a wise servant who saved the life of a prince. The king promised to pay
     whatever the servant could dream up. Knowing that the king loved chess, the servant told the king he would like to have grains of wheat. One grain on the first square of a chess board, with the number of grains doubling on each successive square.

    There are 64 squares on a chessboard (where square 1 has one grain, square 2 has two grains,
     and so on).

    Write code that shows:

        how many grains were on a given square, and
        the total number of grains on the chessboard

    For bonus points

    Did you get the tests passing and the code clean? If you want to, these are some additional things you could try:

        Optimize for speed.
        Optimize for readability.

 */
class Grains {
    // 2 ^ x = amount of grains.
    BigInteger grainsOnSquare(final int square) {
        if (square > 0 && square < 65) {
            return BigInteger.valueOf(2).pow(square - 1);
        } else {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        
    }

    // ( 2 ^ (n+1) ) − 1  -> total of grains on the board
    BigInteger grainsOnBoard() {
        return ( BigInteger.valueOf(2).pow(64).subtract(BigInteger.valueOf(1)));
    }

}