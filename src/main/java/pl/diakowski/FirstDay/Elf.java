package pl.diakowski;

import java.util.ArrayList;

public class Elf {
    private ArrayList<Integer> calories = new ArrayList<>();


    public Elf() {
    }

    public ArrayList<Integer> calories() {
        return calories;
    }


    public void addToList(int number) {
        calories.add(number);
    }
}
