package Proverb;

/*
 * Instructions

    For want of a horseshoe nail, a kingdom was lost, or so the saying goes.

    Given a list of inputs, generate the relevant proverb. For example, given the 
    list ["nail", "shoe", "horse", "rider", "message", "battle", "kingdom"], you
    will output the full text of this proverbial rhyme:

    For want of a nail the shoe was lost.
    For want of a shoe the horse was lost.
    For want of a horse the rider was lost.
    For want of a rider the message was lost.
    For want of a message the battle was lost.
    For want of a battle the kingdom was lost.
    And all for the want of a nail.

    Note that the list of inputs may vary; your solution should be able to handle
    lists of arbitrary length and content. No line of the output text should be a static,
    unchanging string; all should vary according to the input given.

 */

class Proverb {
    private String[] words;

    Proverb(String[] words) {
        setWords(words);        
    }

    private void setWords(String[] words) {
        this.words = words;        
    }

    public String[] getWords() {
        return words;
    }

    String recite() {
        String proverb = new String();

        if (this.getWords().length == 0) {
            proverb = "";
        }

        if (this.getWords().length == 1) {
            proverb = String.format("And all for the want of a %s.", this.getWords()[0]);
        }

        if (this.getWords().length > 1) {
            proverb = proverbPhrase();
        }

        return proverb.toString();
    }

    private String proverbPhrase() {
        StringBuilder proverb = new StringBuilder();

        for (int i = 0; i < this.getWords().length - 1; i++) {
        
            proverb.append(String.format("For want of a %s the %s was lost.\n", this.getWords()[i], this.getWords()[i + 1]));
    
        } 

        proverb.append(String.format("And all for the want of a %s.", this.getWords()[0]));

        return proverb.toString();
    }
}
    
