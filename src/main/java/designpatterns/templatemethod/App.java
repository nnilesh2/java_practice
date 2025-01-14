package designpatterns.templatemethod;

public class App {

    public static void main(String[] args) {
        CoffeeTemplate blackCoffee = new BlackCoffee();
        blackCoffee.prepateCoffee();
        CoffeeTemplate milkCoffee = new MilkCoffee();
        milkCoffee.prepateCoffee();
    }
    
}
