package Lab7.RockPaperScissors;

public class Main {
    public static void winner(Player p1, Player p2){
        System.out.println("Player 1 option: "+p1.getOption());
        System.out.println("Player 2 option: "+p2.getOption());

        if(p1.getOption().equals(p2.getOption()))
            System.out.println("Equal");
        else if(p1.getOption().equals("rock") && p2.getOption().equals("scissors") || p1.getOption().equals("paper") && p2.getOption().equals("rock") ||
                p1.getOption().equals("scissors") && p2.getOption().equals("paper"))
            System.out.println("Player 1 wins");
        else System.out.println("Player 2 wins");
    }

    public static void main(String[] args) throws InterruptedException {
        Player p1=new Player();
        Player p2=new Player();

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        winner(p1,p2);
    }
}
