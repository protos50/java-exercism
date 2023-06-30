package ElonsToyCar;

public class ElonsToyCarMain {
    public static void main(String[] args) {
        ElonsToyCar elonsToyCar1 = ElonsToyCar.buy();

        System.out.println("\nFirst car");
        System.out.println(elonsToyCar1.distanceDisplay());
        System.out.println(elonsToyCar1.batteryDisplay());
        elonsToyCar1.drive();
        System.out.println("After first car drives one time: " + elonsToyCar1.distanceDisplay()
        + "  -  " + elonsToyCar1.batteryDisplay()  + "\n\n");

        System.out.println("\nSecond car");
        ElonsToyCar elonsToyCar2 = ElonsToyCar.buy(10, 33);
        System.out.println(elonsToyCar2.distanceDisplay());
        System.out.println(elonsToyCar2.batteryDisplay());
        elonsToyCar2.drive();
        System.out.println("After second car drives one time: " + elonsToyCar2.distanceDisplay() 
        + "  -  " + elonsToyCar2.batteryDisplay() + "\n\n");


    }
}
