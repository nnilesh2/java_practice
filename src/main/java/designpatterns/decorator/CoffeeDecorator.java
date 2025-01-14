package designpatterns.decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    /**
     * @param coffee
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void getCoffee() {
        coffee.getCoffee();
    }
    
}
