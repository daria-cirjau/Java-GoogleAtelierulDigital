package Lab1.Exercises;
import java.util.Arrays;

public class Exercises {

    public Exercises() {
    }

    public void arrays() {
        char[] copyFrom = new char[]{'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
    }
    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ex.arrays();
    }
}


