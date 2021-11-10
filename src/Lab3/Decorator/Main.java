package Lab3.Decorator;

public class Main {
    public static void main(String[] args) {
        //cafea cu lapte si frisca:
        Coffee coffee =new Coffee();
        Topping milk = new Milk(coffee);
        Beverage whip = new Whip(milk);

        System.out.println(whip.getDescription());
        System.out.println(whip.getCost());

        //ceai cu lapte
        Tea tea = new Tea ();
        Milk teaMilk = new Milk(tea);

        System.out.println(teaMilk.getDescription());
    }
}
