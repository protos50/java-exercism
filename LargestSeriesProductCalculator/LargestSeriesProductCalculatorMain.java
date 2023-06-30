package LargestSeriesProductCalculator;

public class LargestSeriesProductCalculatorMain {
    public static void main(String[] args) {
        LargestSeriesProductCalculator largestSeriesProductCalculator1 = 
                        new LargestSeriesProductCalculator
                        ("1231a4");
        
        System.out.println(largestSeriesProductCalculator1
                .calculateLargestProductForSeriesLength(3));
    }
}
