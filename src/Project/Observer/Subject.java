package Project.Observer;

import java.util.ArrayList;

public class Subject{
    private ArrayList<Observer> observerList;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObs(price);
    }

    Subject(){
        observerList=new ArrayList<Observer>();
    }

    public void add(Observer obs) {
        observerList.add(obs);
    }

    public void remove(Observer obs) {
        observerList.remove(obs);
    }

    public void notifyObs(float price) {
        for(Observer obs: observerList) {
            obs.update(price);
        }
    }
}
