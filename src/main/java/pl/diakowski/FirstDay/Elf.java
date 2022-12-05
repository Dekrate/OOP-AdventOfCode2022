package pl.diakowski.FirstDay;

import java.util.ArrayList;

public class Elf {
    private ArrayList<Integer> calories = new ArrayList<>();



    public ArrayList<Integer> calories() {
        return calories;
    }


    public void addToList(int number) {
        calories.add(number);
    }
}
