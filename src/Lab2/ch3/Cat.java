package Lab2.ch3;

public class Cat extends Animal implements Pet{

    private String name;

    protected Cat(String name) {
        super();
        legs=4;
        this.name=name;
    }

    ///constructor care apeleaza constructorul cu parametrii
    protected Cat(){
        this("");
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {

    }


}
