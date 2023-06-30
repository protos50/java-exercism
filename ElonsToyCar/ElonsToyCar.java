package ElonsToyCar;

/*
 * 

In this exercise you'll be playing around with a remote controlled car, which you've finally 
saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control,
 it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

    The total distance it has driven, displayed as: "Driven <METERS> meters".
    The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".

If the battery is at 0%, you can't drive the car anymore and the battery display will show
 "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.

 */
public class ElonsToyCar {
    private int distanceDriven,
            batteryPercentage;

    public ElonsToyCar(int distanceDriven, int batteryPercentage) {
        this.setDistanceDriven(distanceDriven);
        this.setBatteryPercentage(batteryPercentage);
    }

    public ElonsToyCar() {
        this.setDistanceDriven(0);
        this.setBatteryPercentage(100);
    }

    private void setDistanceDriven(int distance) {
        this.distanceDriven = distance;
    }

    public int getDistanceDriven() {
        return this.distanceDriven;
    }

    private void setBatteryPercentage(int percentage) {
        this.batteryPercentage = percentage;
    }

    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    /*
     * TASK 1
     * Buy a brand-new remote controlled car
     * 
     * Implement the (static) ElonsToyCar.buy() method to return a brand-new remote
     * controlled car
     * instance:
     * 
     * ElonsToyCar car = ElonsToyCar.buy();
     */
    public static ElonsToyCar buy() {
        return new ElonsToyCar();

    }

    public static ElonsToyCar buy(int distance, int batteryPercentage) {
        return new ElonsToyCar(distance, batteryPercentage);

    }

    /*
     * TASK 2
     * Display the distance driven
     * 
     * Implement the ElonsToyCar.distanceDisplay() method to return the distance
     * as displayed on the LED display:
     * 
     * ElonsToyCar car = ElonsToyCar.buy();
     * car.distanceDisplay();
     * // => "Driven 0 meters"
     * 
     * TIPS
     * 
     * Display the distance driven
     * 
     * Keep track of the distance driven in a field.
     * Consider what visibility to use for the field (does it need to be used
     * outside the class?).
     * 
     */
    public String distanceDisplay() {
        return String.format("Driven %d meters", this.getDistanceDriven());
    }

    /*
     * TASK 3
     * Display the battery percentage
     * 
     * Implement the ElonsToyCar.batteryDisplay() method to return the battery
     * percentage as displayed on the LED display:
     * 
     * ElonsToyCar car = ElonsToyCar.buy();
     * car.batteryDisplay();
     * // => "Battery at 100%"
     * 
     * TIPS
     * 
     * Display the battery percentage
     * 
     * Keep track of the distance driven in a field.
     * Initialize the field to a specific value to correspond to the initial battery
     * charge.
     * Consider what visibility to use for the field (does it need to be used
     * outside the class?).
     * 
     * -----------------------------------------------------------------------------
     * ----
     * 
     * TASK 4
     * Update the number of meters driven when driving
     * 
     * Implement the ElonsToyCar.drive() method that updates the number of
     * meters driven:
     * 
     * ElonsToyCar car = ElonsToyCar.buy();
     * car.drive();
     * car.drive();
     * car.distanceDisplay();
     * // => "Driven 40 meters"
     * 
     * TIPS
     * 
     * Update the number of meters driven when driving
     * 
     * Update the field representing the distance driven.
     */
    public String batteryDisplay() {
        if (this.getBatteryPercentage() == 0) {
            return "Battery empty";
        } else {
            return String.format("Battery at %d%%", this.getBatteryPercentage());            
        }
    }

    /*
     * TASK 5
     * Update the battery percentage when driving
     * 
     * Update the ElonsToyCar.drive() method to update the battery percentage:
     * 
     * ElonsToyCar car = ElonsToyCar.buy();
     * car.drive();
     * car.drive();
     * car.batteryDisplay();
     * // => "Battery at 98%"
     * 
     * TIPS
     * Update the battery percentage when driving
     * 
     * Update the field representing the battery percentage driven.
     * 
     * TASK 6
     * Prevent driving when the battery is drained
     * 
     * Update the ElonsToyCar.drive() method to not increase the distance driven nor
     * decrease the battery percentage when the battery is drained (at 0%):
     * 
     * ElonsToyCar car = ElonsToyCar.buy();
     * 
     * // Drain the battery
     * // ...
     * 
     * car.distanceDisplay();
     * // => "Driven 2000 meters"
     * 
     * car.batteryDisplay();
     * // => "Battery empty"
     * 
     * TIPS:
     * Prevent driving when the battery is drained
     * 
     * Add a conditional to only update the distance and battery if the battery is
     * not
     * already drained.
     * Add a conditional to display the empty battery message if the battery is
     * drained.
     * 
     * 
     */
    public void drive() {
        if (this.getBatteryPercentage() > 0) {

            this.setBatteryPercentage(this.getBatteryPercentage() - 1);
            this.setDistanceDriven(getDistanceDriven() + 20);

        }
    }
}