package Lab8.ex1;

public class Test {
    private int j;
    public int testLambda(){
        int i=0;
        j++;
        Runnable r=()->{
            System.out.println(i);
            System.out.println(this.j);
        };
        r.run();
        return i;
    }

    public static void main(String[] args) {

    }
}
