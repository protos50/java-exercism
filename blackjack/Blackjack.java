package blackjack;

public class Blackjack {

    /*
     * Calculate the score of any given card.

        Implement a function to calculate the numerical value of a card given its name using conditionals.

        parseCard("ace")
        // returns 11

        card 	value 	card 	value
        ace 	11 	    eight 	8
        two 	2 	    nine 	9
        three 	3 	    ten 	10
        four 	4 	    jack 	10
        five 	5 	    queen 	10
        six 	6 	    king 	10
        seven 	7 	    other 	0
     */
    public int parseCard(String card) {
        int cardValue;
        switch (card) {
            case "ace":
                cardValue = 11;
        
                break;

            case "two":
                cardValue = 2;
        
                break;

            case "three":
                cardValue = 3;
        
                break;

            case "four":
                cardValue = 4;
        
                break;

            case "five":
                cardValue = 5;
        
                break;

            case "six":
                cardValue = 6;
        
                break;

            case "seven":
                cardValue = 7;
        
                break;

            case "eight":
                cardValue = 8;
        
                break;

            case "nine":
                cardValue = 9;
        
                break;

            case "ten":
                cardValue = 10;
        
                break;

            case "jack":
                cardValue = 10;
        
                break;

            case "queen":
                cardValue = 10;
        
                break;

            case "king":
                cardValue = 10;
        
                break;

            default:
                cardValue = 0;

                break;
        }

        return cardValue;
    }

    /*
     * Determine if two cards make up a Blackjack.

        Implement a function that returns true if two cards form a Blackjack, false otherwise.

        isBlackjack("queen", "ace")
        // returns true

     */
    public boolean isBlackjack(String card1, String card2) {
        if ((this.parseCard(card2) + this.parseCard(card1)) == 21) {
            return true;
        } else {
            return false;
        }        
    }

    /*
     * Implement the decision logic for hand scores larger than 20 points.

        Implement a function that returns the string representation of a decision given your cards. 
        This function is only called if the handScore is larger than 20. It will receive 2 arguments: 
        isBlackJack and dealerScore. It should implement the bulletpoints in the category "Large Hand" above.

        isBlackJack = true
        dealerScore = 7
        largeHand(isBlackJack, dealerScore)
        // returns "W"

        -> Category: Large Hand <-

        If you have a pair of aces you must always split them.
        If you have a Blackjack (two cards that sum up to a value of 21), and the dealer
        does not have an ace, a figure or a ten then you automatically win. If the dealer does
        have any of those cards then you'll have to stand and wait for the reveal of the other card.

     */
    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return "P";
        }else if (dealerScore == 11 || dealerScore == 10) {
            return "S";
        } else {
            return "W";
        }
    }

    /*
     * Implement the decision logic for hand scores with less than 21 points.

        Implement a function that returns the string representation of a decision given your cards.
         This function is only called if the handScore is less than 21. It will receive 2 arguments: handScore
          and dealerScore. It should implement the bulletpoints in the category "Small Hand" above.

        handScore = 15
        dealerScore = 12
        SmallHand(handScore, dealerScore)
        // returns "H"

        Category: Small Hand

        If your cards sum up to 17 or higher you should always stand.
        If your cards sum up to 11 or lower you should always hit.
        If your cards sum up to a value within the range [12, 16] you should always stand unless the dealer has a 7 or higher, 
        in which case you should always hit.
     */
    public String smallHand(int handScore, int dealerScore) {
        if ( (handScore <= 11 || ( (handScore > 11) && (handScore < 17) && dealerScore >= 7) ) ) {
            return "H";
        } else {
            return "S";
        } 
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
