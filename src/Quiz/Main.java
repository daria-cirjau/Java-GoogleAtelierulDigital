package Quiz;

public class Main {
    public static void main(String[] args) {

        int i = 1;
        switch (i) {
            case 1:
                System.out.println("one player is playing this game");
            case 2:
                System.out.println("two players are playing this game");
                break;
            default:
                System.out.println("you did not enter a valid value");
        }
    }
}
