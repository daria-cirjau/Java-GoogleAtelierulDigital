package Lab3.Visitor;

public class Video implements Element {
    private String name;
    private String type;
    private int price;
    private int time;

    public Video(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return name+",price "+price+", time "+time;
    }
}
