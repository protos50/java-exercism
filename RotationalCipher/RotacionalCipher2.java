package RotationalCipher;

class RotationalCipher2 {
    private int shiftKey;

    RotationalCipher2(int shiftKey) {
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
                int relativePosition = ((int) c - (int) 'a');
                int shift = (shiftKey + relativePosition) % 26;
                c = (char) ((int)'a' + shift );

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
