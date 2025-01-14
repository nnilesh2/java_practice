package designpatterns.decorator;

public class SugarDecorator extends CoffeeDecorator{

    /**
     * @param coffee
     */
    public SugarDecorator(Coffee coffee) {
      super(coffee);
    }

    @Override
    public void getCoffee() {
        coffee.getCoffee();;
        System.out.println("Adding Sugar to the coffee....");
    }
    
}
