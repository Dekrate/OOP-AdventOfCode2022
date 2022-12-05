package pl.diakowski.FourthDay;

import java.util.ArrayList;

public class Pair {
    private final ArrayList<Elf> elves = new ArrayList<>();


    public Pair() {
    }

    public void add(Elf elf) {
        elves.add(elf);
    }

    public boolean ifOneContainAnother() { // although it's easier to make by negating the fact of not containing each other
        if (elves.get(0).begin() < elves.get(1).begin() && elves.get(0).end() > elves.get(1).end()) { // 1.1 2.2 2.3 1.4
            return true;
        } else if (elves.get(1).begin() < elves.get(0).begin() && elves.get(1).end() > elves.get(0).end()) { // 2.1 1.2 1.3 2.4
            return true;
        } else if (elves.get(0).begin() <= elves.get(1).begin() && elves.get(0).end() >= elves.get(1).end()) {
            return true;
        } else return elves.get(1).begin() <= elves.get(0).begin() && elves.get(1).end() >= elves.get(0).end();
    }

}
