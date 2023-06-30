package ReverseString;

public class ReverseString {

    public String reverse(String inputString) {
        String reverseString = "";
        
        for (int i = inputString.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }

        return reverseString;
    }
  
}