package Fighter;

/*
 * In this exercise you're playing a role-playing game named "Wizards and Warriors," which allows you to play as either a
 *  Wizard or a Warrior.

    There are different rules for Warriors and Wizards to determine how much damage points they deal.

    For a Warrior, these are the rules:

        Deal 6 points of damage if the fighter they are attacking is not vulnerable
        Deal 10 points of damage if the fighter they are attacking is vulnerable

    For a Wizard, these are the rules:

        Deal 12 points of damage if the Wizard prepared a spell in advance
        Deal 3 points of damage if the Wizard did not prepare a spell in advance

    In general, fighters are never vulnerable. However, Wizards are vulnerable if they haven't prepared a spell.

    You have six tasks that work with Warriors and Wizard fighters.

 */

 /* TASK 1
  * Override the toString() method on the Fighter class to return a description of the fighter, formatted as "Fighter is a 
  <FIGHTER_TYPE>".

    Fighter warrior = new Warrior();
    warrior.toString();
    // => "Fighter is a Warrior"



    TASK 2
    Make fighters not vulnerable by default

    Ensure that the Fighter.isVulnerable() method always returns false.

    Fighter warrior = new Warrior();
    warrior.isVulnerable();
    // => false


    TASK 3
    Allow Wizards to prepare a spell

    Implement the Wizard.prepareSpell() method to allow a Wizard to prepare a spell in advance.

    Wizard wizard = new Wizard();
    wizard.prepareSpell();


    Task 4
    Make Wizards vulnerable when not having prepared a spell

    Ensure that the isVulnerable() method returns true if the wizard did not prepare a spell; otherwise, return false.

    Fighter wizard = new Wizard();
    wizard.isVulnerable();
    // => true


    Task 5
    Calculate the damage points for a Wizard

    Implement the Wizard.damagePoints() method to return the damage points dealt: 12 damage points when a spell has been
     prepared, 3 damage points when not.

    Wizard wizard = new Wizard();
    Warrior warrior = new Warrior();

    wizard.prepareSpell();
    wizard.damagePoints(warrior);
    // => 12

  */
  
abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}


// -----------------------------------------------------------------------------------------------------------------


class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    /*
     *   Task 6
            Calculate the damage points for a Warrior

            Implement the Warrior.damagePoints() method to return the damage points dealt: 10 damage points when the 
            target is vulnerable, 6 damage points when not.

            Warrior warrior = new Warrior();
            Wizard wizard = new Wizard();

            warrior.damagePoints(wizard);
            // => 10
     * 
     */


    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}


// -----------------------------------------------------------------------------------------------------------------


class Wizard extends Fighter {
    boolean spellPrepared = false;

    void setSpellPrepared(boolean preparedBoolean) {
        this.spellPrepared = preparedBoolean;
    }

    boolean getSpellPrepared() {
        return this.spellPrepared;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        if (!this.getSpellPrepared()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     *   Task 5
        Calculate the damage points for a Wizard

        Implement the Wizard.damagePoints() method to return the damage points dealt: 12 damage points when a spell has 
        been prepared, 3 damage points when not.

        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();

        wizard.prepareSpell();
        wizard.damagePoints(warrior);
        // => 12
     */
    @Override
    int damagePoints(Fighter warrior) {
    
        if (this.getSpellPrepared()) {
            return 12;
        } else {
            return 3;
        }
        
    }

    void prepareSpell() {
        this.setSpellPrepared(true); 
    }

}
