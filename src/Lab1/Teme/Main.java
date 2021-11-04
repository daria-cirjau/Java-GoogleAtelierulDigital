package Lab1.Teme;


public class Main {
    public static void main(String[] args) {

        Challenges c=new Challenges();
        System.out.println("Challenge 1:");
        c.Challenge1();
        System.out.println("\nChallenge 2 exemplu pentru un singur numar:");
        System.out.println("\n Stage 1:");
        System.out.println(c.compute(3339));
        System.out.println(c.compute2(330039));
        System.out.println("\nChallenge 2 exemplu pentru un vector\nStage 1:");
        for(int i=0;i<=53;i++){
            System.out.println(i+" "+c.compute(i));
        }
        for(int i=0;i<=53;i++){
            System.out.println(i+" "+c.compute2(i));
        }
        System.out.println("\nChallenge 3:");
        int a[]={3,3,3,4,4};
        c.Challenge3(5,a);
        System.out.println("\nChallenge 4:");
        int b[]={3,3,3,3,3,3};
        c.Challenge4(6,b);
    }
}
