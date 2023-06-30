package RaindropConverter;

public class RaindropConverterMain {
    public static void main(String[] args) {
        RaindropConverter raindropConverter1 = new RaindropConverter();

        /*
         * Examples

            28 has 7 as a factor, but not 3 or 5, so the result would be "Plong".
            30 has both 3 and 5 as factors, but not 7, so the result would be "PlingPlang".
            34 is not factored by 3, 5, or 7, so the result would be "34".
         */
        System.out.println(raindropConverter1.convert(28));

        System.out.println(raindropConverter1.convert(30));

        System.out.println(raindropConverter1.convert(34));

    }
}
