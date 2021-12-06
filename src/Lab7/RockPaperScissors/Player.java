package Lab7.RockPaperScissors;

import java.util.Random;

public class Player extends Thread{

    private String playerOption;

    @Override
    public void run(){
        Random randomIndex=new Random();
        int r=randomIndex.nextInt(3);

        String[] options=new String[] {"rock","paper","scissors"};
        playerOption = options[r];
    }

    public String getOption(){
        return playerOption;
    }
}
