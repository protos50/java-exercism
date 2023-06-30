package ResistorColor;

public class ResistorColorMian {
    public static void main(String[] args) {
        ResistorColor resistorColor = new ResistorColor();
        
        System.out.println(resistorColor.colorCode("red"));
        for (String color : resistorColor.colors()) {
            System.out.println(color);
        }
    }
}
