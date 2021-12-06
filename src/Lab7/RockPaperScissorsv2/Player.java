package Lab7.RockPaperScissorsv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Player extends Thread {
    private String name;
    private String option;
    private ArrayList<String> options= new ArrayList<>(Arrays.asList("rock","paper","scissors"));

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        option=options.get(new Random().nextInt(2));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", option='" + option + '\'' +
                ", options=" + options +
                '}';
    }

    public String getNume() {
        return name;
    }

    public String getOption() {
        return option;
    }
}
