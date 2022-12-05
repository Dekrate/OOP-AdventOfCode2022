package pl.diakowski.SecondDay;

import java.util.ArrayList;

public class Round {
    private ArrayList<String> round = new ArrayList<>();

    public void addParameters(String[] values) {
        round.add(values[0]);
        round.add(values[1]);
    }

    public int possiblePoints(int points) {
        switch (round.get(0)) {
            case "A":  // kamień
                switch (round.get(1)) {
                    case "X" ->  // rock
                            points = points + 1 + 3;
                    case "Y" ->  // paper
                            points = points + 2 + 6;
                    case "Z" ->  // scissors
                            points = points + 3; // + 0
                }
                break;
            case "B":  // papier
                switch (round.get(1)) {
                    case "X" ->  // rock
                            points += 1;
                    case "Y" ->  // paper
                            points = points + 3 + 2;
                    case "Z" ->  // scissors
                            points = points + 3 + 6;
                }
                break;
            case "C": // nożyce
                switch (round.get(1)) {
                    case "X" -> // rock
                            points = points + 6 + 1;
                    case "Y" -> // paper
                            points += 2;
                    case "Z" -> // scissors
                            points = points + 3 + 3;
                }
        }
        return points;
    }
}
