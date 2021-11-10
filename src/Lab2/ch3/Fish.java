package Lab2.ch3;

public class Fish extends Animal{

    protected Fish(){
        super();
        legs=0;
        System.out.println("Fish can't walk and don't have legs");
    }

    @Override
    public void eat() {

    }
}
