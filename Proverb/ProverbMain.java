package Proverb;

public class ProverbMain {
    public static void main(String[] args) {
        String[] words =  {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom" };

        Proverb proverb1 = new Proverb(words);
        
        System.out.println(proverb1.recite());
    }
}
