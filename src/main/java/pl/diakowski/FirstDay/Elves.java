package pl.diakowski;

import java.util.*;

public class Elves {
    private ArrayList<Elf> elves = new ArrayList<>();

    public Elves() {
    }

    public void addToList(Elf elf) {
        elves.add(elf);
    }

    public int maxValue() {
        ArrayList<Integer> maxValues = new ArrayList<>();
        elves.forEach(elf -> {
            maxValues.add(elf.calories().stream()
                    .mapToInt(Integer::intValue)
                    .sum());
        });
        maxValues.sort(Integer::compareTo);
        return maxValues.get(maxValues.size() - 1);
    }

    public int sumOfTopThreeElves() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        elves.forEach(elf -> {
            arrayList.add(elf.calories().stream().mapToInt(Integer::intValue).sum());
        });
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size() - 1) + arrayList.get(arrayList.size() - 2)
                + arrayList.get(arrayList.size() - 3);
    }
}
