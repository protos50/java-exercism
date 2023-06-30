package blackjack;

public class BlackjackMain {
    public static void main(String[] args) {
        Blackjack blackjack1 = new Blackjack();

        //task 1
        System.out.println(blackjack1.parseCard("queen"));
        //task 2
        System.out.println(blackjack1.isBlackjack("queen", "ace"));
        //task 3
        System.out.println(blackjack1.largeHand(blackjack1.isBlackjack("ace", "ace"), 11) );
        //task 4
        System.out.println(blackjack1.smallHand(15, 12) );
    }    
}
