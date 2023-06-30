package LuhnValidator;

public class LuhnValidatorMain {
    public static void main(String[] args) {
        LuhnValidator luhnValidator1 = new LuhnValidator();

        System.out.println(luhnValidator1.isValid("5405 7300 0067 0317"));     
    }
}
