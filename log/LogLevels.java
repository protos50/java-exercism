package log;

public class LogLevels {
    
    /*
     * Get message from a log line

        Implement the (static) LogLevels.message() method to return a log line's message:

        LogLevels.message("[ERROR]: Invalid operation")
        // => "Invalid operation"

        Any leading or trailing white space should be removed:

        LogLevels.message("[WARNING]:  Disk almost full\r\n")
        // => "Disk almost full"


     */
    public static String message(String logLine) {
        //split method breake the string and returns an string array. Index 1 element is the string wanted.
        String logString = logLine.split("]:")[1];
        //trim method removed blackspace
        logString = logString.trim();
        return logString;
    }

    /*
     * Get log level from a log line

        Implement the (static) LogLevels.logLevel() method to return a log line's log 
        level, which should be returned in lowercase:

        LogLevels.logLevel("[ERROR]: Invalid operation")
        // => "error"
     */
    public static String logLevel(String logLine) {
        //first split from ] and then split the leading [
        return logLine.split("]")[0].split("\\[")[1].toLowerCase();
    }

    /*
     * Reformat a log line

        Implement the (static) LogLevels.reformat() method that reformats the log line, 
        putting the message first and the log level after it in parentheses:

        LogLevels.reformat("[INFO]: Operation completed")
        // => "Operation completed (info)"


     */
    public static String reformat(String logLine) {
        return (LogLevels.message(logLine).concat(" (").concat(LogLevels.logLevel(logLine)).concat(")"));
    }
}