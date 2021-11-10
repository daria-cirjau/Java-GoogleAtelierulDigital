package Lab2.ch3;

public abstract class Animal {
    protected int legs;

    protected Animal() {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void walk(int legs){
        System.out.println("This animal walks on "+legs+"legs");
    }

    public abstract void eat();

}
