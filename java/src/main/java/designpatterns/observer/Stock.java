package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{

    private String name;
    private double price;

    private List<Observer> observers = new ArrayList<>();


    /**
     * @param name
     * @param price
     */
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this.price));
    }
    
    public void setPrice(double price){
        this.price = price;
        notifyObserver();
    }
}
