package Project.Observer;

public class USAShop implements Observer{
    Subject p;

    public USAShop(Subject p)
    {
        this.p=p;
        this.p.add(this);
    }

    @Override
    public void update(float price) {
        System.out.println( "Price for USA: " + p.getPrice()*0.23+" usd");
    }
}
