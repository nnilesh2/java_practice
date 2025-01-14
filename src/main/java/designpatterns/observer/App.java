package designpatterns.observer;

public class App {
    public static void main(String[] args) {

        Stock stock = new Stock("HDFC", 100.00);

        stock.addObserver(new Investor("Nilesh"));
        stock.addObserver(new Investor("Bela Nagare"));

        stock.setPrice(101.00);
        
    }
    
}
