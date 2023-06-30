package log;

public class log {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(LogLevels.message("[ERROR]: Pingo Diondo")); 
        System.out.println(LogLevels.logLevel("[WARNING]: Elon Musk is going to scape from earth")); 
        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));         
    }

}
