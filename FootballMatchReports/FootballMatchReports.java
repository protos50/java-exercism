package FootballMatchReports;

/*
 * Instructions

You are developing a system to help the staff of a football/soccer club's web site report on matches. Data is received from a
 variety of sources and piped into a single stream after being cleaned up.

Task 1
Output descriptions of the players based on their shirt number

The team only ever plays a 4-3-3 formation and has never agreed with the 1965 change to the rules allowing for substitutions,
 never mind enlarged squads.

The player descriptions are as follows:

1 -> "goalie"
2 -> "left back"
3 & 4 "center back"
5 -> "right back"
6, 7, & 8 -> "midfielder"
9 -> "left wing"
10 -> "striker"
11 -> "right wing"

Implement the static FootballMatchReports.onField() method to output a player description based on their shirt number.

FootballMatchReports.onField(10);
// => "striker"

Task 2
Raise an alert if an unknown shirt number is encountered

Modify the FootballMatchReports.onField() method to throw an IllegalArgumentException when a shirt number outside the range 1-11
 is processed.

FootballMatchReports.onField(13);
// => Throw IllegalArgumentException


 */
public class FootballMatchReports {
    public static String onField(int shirtNum) {
        String playerDescription = "";

        switch (shirtNum) {
            case 1:
                playerDescription = "goalie";
                break;

            case 2:
                playerDescription = "left back";
                break;

            case 3, 4:
                playerDescription = "center back";
                break;

            case 5:
                playerDescription = "right back";
                break;

            case 6, 7, 8:
                playerDescription = "midfielder";
                break;

            case 9:
                playerDescription = "left wing";
                break;

            case 10:
                playerDescription = "striker";
                break;

            case 11:
                playerDescription = "right wing";
                break;

            default:
                throw new IllegalArgumentException();
        }

        return playerDescription;
    }
}