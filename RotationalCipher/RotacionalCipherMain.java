package RotationalCipher;

public class RotacionalCipherMain {
    public static void main(String[] args) {
        // a = 97 , z = 122
        RotationalCipher rotationalCipher1 = new RotationalCipher(13);

        String word = "Gur dhvpx oebja sbk whzcf bire gur ynml qbt.";
        String rot = rotationalCipher1.rotate(word);
        System.out.println("Original Word: " + word + "\nRotated Word: " + rot);

        System.out.println("The quick brown fox jumps over the lazy dog.".equals(rot));


        RotationalCipher2 rotationalCipher2 = new RotationalCipher2(13);

        word = "Gur dhvpx oebja sbk whzcf bire gur ynml qbt.";
        rot = rotationalCipher2.rotate(word);
        System.out.println("Original Word: " + word + "\nRotated Word: " + rot);

        System.out.println("The quick brown fox jumps over the lazy dog.".equals(rot));
    }
}
