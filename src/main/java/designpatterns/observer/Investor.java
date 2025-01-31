package designpatterns.observer;

public class Investor implements Observer{

    private String name;

    /**
     * @param name
     */
    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Investor Name : "+name+" New price received :"+price);
    }
    
}
