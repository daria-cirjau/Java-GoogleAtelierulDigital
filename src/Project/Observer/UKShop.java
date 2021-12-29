package Project.Observer;

public class UKShop implements Observer{
    Subject p;

    public UKShop(Subject p)
    {
        this.p=p;
        this.p.add(this);
    }

    @Override
    public void update(float price) {
        System.out.println( "Price for USA: " + p.getPrice()*0.17+" gbp");
    }
}