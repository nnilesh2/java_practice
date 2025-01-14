package designpatterns.decorator;

public class MilkDecorator extends CoffeeDecorator{
    /**
     * @param coffee
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getCoffee() {
        coffee.getCoffee();
        System.out.println("Adding Milk to the coffee...");
    }
    
}
