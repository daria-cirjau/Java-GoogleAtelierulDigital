package Project.Observer;

public class EuropeShop implements Observer{
    Subject p;

    public EuropeShop(Subject p)
    {
        this.p=p;
        this.p.add(this);
    }

    @Override
    public void update(float price) {
        System.out.println( "Price for Europe: " + p.getPrice()*0.2+" euro");
    }
}