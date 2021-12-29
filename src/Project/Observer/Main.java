package Project.Observer;

public class Main {
    public static void main(String[] args) {
        Subject p=new Subject();

        new RomaniaShop(p);
        new ChinaShop(p);
        new EuropeShop(p);
        new USAShop(p);
        new UKShop(p);

        System.out.println("Price in 2020 was 15 ron ");
        p.setPrice(15);
        System.out.println("Price in 2021 is 20 ron ");
        p.setPrice(20);
    }
}
