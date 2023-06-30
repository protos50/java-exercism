package RotationalCipher;

/*
 * Create an implementation of the rotational cipher, also sometimes called the Caesar
 *  cipher.

    The Caesar cipher is a simple shift cipher that relies on transposing all the letters
    in the alphabet using an integer key between 0 and 26. Using a key of 0 or 26 will
    always yield the same output due to modular arithmetic. The letter is shifted for
    as many values as the value of the key.

    The general notation for rotational ciphers is ROT + <key>. The most commonly used 
    rotational cipher is ROT13.

    A ROT13 on the Latin alphabet would be as follows:

    Plain:  abcdefghijklmnopqrstuvwxyz
    Cipher: nopqrstuvwxyzabcdefghijklm

    It is stronger than the Atbash cipher because it has 27 possible keys, and 25 usable 
    keys.

    Ciphertext is written out in the same formatting as the input including spaces and
     punctuation.
    Examples

        ROT5 omg gives trl
        
        ROT0 c gives c

        ROT26 Cool gives Cool

        ROT13 The quick brown fox jumps over the lazy dog. 
                gives Gur dhvpx oebja sbk whzcf bire gur ynml qbt.

        ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. 
                gives The quick brown fox jumps over the lazy dog.

 */
class RotationalCipher {
        private int shiftKey;

        RotationalCipher(int shiftKey) {
                this.setShiftKey(shiftKey);
        }

        private void setShiftKey(int shiftKey) {
                this.shiftKey = shiftKey;
        }

        public int getShiftKey() {
                return shiftKey;
        }

        String rotate(String data) {
                StringBuilder shiftedWord = new StringBuilder();
                int shiftKey = this.getShiftKey();

                for (int i = 0; i < data.length(); i++) {
                        char c = data.charAt(i);

                        boolean isUpper = Character.isUpperCase(c);

                        c = Character.toLowerCase(c);

                        if (c > 'z' || c < 'a') {
                                shiftedWord.append(c);
                                
                        } else {
                                if ((int) c + shiftKey > (int) 'z') {
                                        int charPosition = shiftKey - ((int) 'z' - (int) c);

                                        c = (char) ((int) 'a' - 1 + charPosition);
                                } else {
                                        c = (char) ((int) c + shiftKey);
                                }

                                if (isUpper) {
                                        shiftedWord.append(Character.toUpperCase(c));
                                } else {
                                        shiftedWord.append(c);
                                }

                        }

                }

                return shiftedWord.toString();
        }

}
