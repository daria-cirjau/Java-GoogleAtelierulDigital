package Project.Observer;

public class ChinaShop implements Observer{
    Subject p;

    public ChinaShop(Subject p)
    {
        this.p=p;
        this.p.add(this);
    }

    @Override
    public void update(float price) {
        System.out.println( "Price for China: " + p.getPrice()*26.34+" yen");
    }
}