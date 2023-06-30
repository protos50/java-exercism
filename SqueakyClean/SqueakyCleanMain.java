package SqueakyClean;


public class SqueakyCleanMain {
    public static void main(String[] args) {     
        String str1 = SqueakyClean.clean("  -my\0\r\u007FId a-12C");
        
        System.out.println(str1);
    }
}
