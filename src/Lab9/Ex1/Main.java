package Lab9.Ex1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int factor=2;
        IntStream s=IntStream.range(0,1000)
                                .map(e->{
                                    System.out.println("e1="+e);
                                   return  e*factor;
                                })
                                .filter(e->{
                                    System.out.println("e2="+e);
                                    return e>5;});

        int first=s.findFirst().getAsInt();
        System.out.println(first);
    }
}
