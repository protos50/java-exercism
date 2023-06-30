package CarsAssemble;

public class CarsAssembleMain {
    public static void main(String[] args) {
        CarsAssemple carAssemble1 = new CarsAssemple();
        
        System.out.println(carAssemble1.productionRatePerHour(6));
        
        System.out.println(carAssemble1.workingItemsPerMinute(6));
    }
}