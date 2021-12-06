package Lab7.RockPaperScissorsv2;

public class Main {

    public String getWinner(Player p1, Player p2){
        String winner=null;
        System.out.println("Player "+p1.getNume()+" option is "+p1.getOption());
        System.out.println("Player "+p2.getNume()+" option is "+p2.getOption());
        if(p1.getOption().equals("rock") && p2.getOption().equals("scissors") ||
            p1.getOption().equals("scissors")&&p2.getOption().equals("paper") ||
            p1.getOption().equals("paper")&&p2.getOption().equals("rock"))
                winner=p1.getNume();
        else winner=p2.getNume();

            return winner;
    }
    public static void main(String[] args) throws InterruptedException {

        Player p1 = new Player("player 1");
        Player p2 = new Player("player 2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        String winner=new Main().getWinner(p1,p2);

        if(winner!=null)
            System.out.println("Winner is "+ winner);
        else
            System.out.println("Draw.");
    }
}
