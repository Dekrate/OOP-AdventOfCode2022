package pl.diakowski.ThirdDay;

public class Char {
    private final char character;

    public Char(char character) {
        this.character = character;
    }

    public int wage() {
        if (Character.isLowerCase(character)) {
            return 96 - (int) character;
        } else {
            return 38 - (int) character;
        }
    }
}
