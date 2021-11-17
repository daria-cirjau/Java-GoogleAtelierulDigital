package Lab4.Exceptions.ex1;

public class Main {
    public static void main(String[] args) {
        PaymentCalculator pc=new PaymentCalculator();
        System.out.println(pc.calculate(10));
        System.out.println(pc.calculate(0));
        System.out.println(pc.calculate(50));
    }
}
