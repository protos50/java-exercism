package MicroBlog;

public class MicroBlogMain {
    public static void main(String[] args) {
        MicroBlog microBlog1 = new MicroBlog();
        
        System.out.println(microBlog1.truncate("❄🌡🤧🤒🏥"));

        microBlog1.countString("❄🌡🤧🤒🏥");
    }
}
