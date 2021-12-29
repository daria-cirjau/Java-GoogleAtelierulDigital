package Project.Observer;

public class RomaniaShop implements Observer{
    Subject p;

    public RomaniaShop(Subject p)
    {
        this.p=p;
        this.p.add(this);
    }

    @Override
    public void update(float price) {
        System.out.println( "Price for Romania: " + p.getPrice()+" ron");
    }
}
