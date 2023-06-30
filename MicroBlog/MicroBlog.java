package MicroBlog;

/*
 * Instructions

    You have identified a gap in the social media market for very very short posts. Now that Twitter allows 280 character posts, people wanting quick social media updates aren't being served. You decide to create your own social media network.

    To make your product noteworthy, you make it extreme and only allow posts of 5 or less characters. Any posts of more than 5 characters should be truncated to 5.

    To allow your users to express themselves fully, you allow Emoji and other Unicode.

    The task is to truncate input strings to 5 characters.
 */
class MicroBlog {
    public String truncate(String input) {
        //codePointCount is used because the length of some emojis is 2 when it is supposed to be 1. Thus, it measures correctly 
        if (input.codePointCount(0, input.length())  > 5) {
            return input.substring(0, input.offsetByCodePoints(0, 5));
            } else {
            return input;
        }
    }

    // metodo para testear la diferencia nomas ;)
    public void countString(String input) {
        System.out.println("Measuring the length of the string with length() : " + input.length());
        System.out.println("Measuring the length of the string with codePointCount() : " + input.codePointCount(0, input.length())); 
    }
}
