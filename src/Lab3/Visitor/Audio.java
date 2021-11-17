package Lab3.Visitor;

public class Audio implements Element {
    private String name;
    private int time;
    private int price;

    public Audio(String name, int time, int price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public String toString(){
        return name+", price"+ price+ ", time "+ time;
    }

}
