package pl.diakowski.ThirdDay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/pl/diakowski/ThirdDay/data.txt");
        ArrayList<Integer> wages = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            long count = Files.lines(file.toPath()).count();
            for (long i = 0; i < count; i++) {
                String line = scanner.nextLine();
                Rucksack rucksack = new Rucksack();
                rucksack.findAndAddItemsToRucksack(line);
                Char aChar = new Char(rucksack.theSameChar());
                wages.add(Math.abs(aChar.wage()));
            }
        } catch (IOException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        System.out.println(wages.stream().mapToInt(Integer::intValue).sum());
    }
}
