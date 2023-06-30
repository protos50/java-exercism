package CarsAssemble;

/*
 * In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. 
 * The assembly line's speed can range from 0 (off) to 10 (maximum).

    At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed.
     So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase
      the likelihood that faulty cars are produced, which then have to be discarded. The following table shows how
       speed influences the success rate:

    1 to 4: 100% success rate.
    5 to 8: 90% success rate.
    9: 80% success rate.
    10: 77% success rate.

 */
public class CarsAssemple {
    /*
     * Calculate the production rate per hour

        Implement the CarsAssemble.productionRatePerHour() method to calculate the assembly line's production rate per hour,
         taking into account its current assembly line's speed :

        CarsAssemble.productionRatePerHour(6)
        // => 1193.4

     */

     public double productionRatePerHour(int speed) {
        double ratePerHour;

        if (speed == 10 ) {
            ratePerHour = speed * 221 * 0.77;

        } else if (speed == 9) {
            ratePerHour = speed * 221 * 0.80;

        } else if (speed<= 8 && speed >= 5) {
            ratePerHour = speed * 221 * 0.90;

        } else {
            ratePerHour = speed * 221;
        }
        
            return ratePerHour;
    }

    /*
     * Implement the CarsAssemble.workingItemsPerMinute() method to calculate how many working cars are produced per minute:

        CarsAssemble.workingItemsPerMinute(6)
        // => 19

     */
    public int workingItemsPerMinute(int speed) {
        return (int) Math.floor(this.productionRatePerHour(speed) / 60);
    }
}
