package pl.diakowski.SecondDay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int points = 0;
        File file = new File("src/main/java/pl/diakowski/SecondDay/data.txt");
        try (Scanner scanner = new Scanner(file)) {
            long count = Files.lines(file.toPath()).count();
            for (long i = 0; i < count + 1; i++) {
                if (scanner.hasNextLine()) {
                    Round round = new Round();
                    String s = scanner.nextLine();

                    // GRACZ: X rock, Y paper, Z scissors
                    // OPONENT: niech A - rock, B - paper, C - scissors
                    String[] values = s.split(" ");
                    round.addParameters(values);
                    points = round.possiblePoints(points);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(points);
    }
}
