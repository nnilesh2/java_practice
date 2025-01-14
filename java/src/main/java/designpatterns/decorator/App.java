package designpatterns.decorator;

public class App {
    public static void main(String[] args) {
        Coffee coffee = new  SimpleCoffee(); 
        coffee.getCoffee();
        MilkDecorator milCoffee = new MilkDecorator(coffee);
        milCoffee.getCoffee();
        SugarDecorator sugarCoffee = new SugarDecorator(milCoffee);
        sugarCoffee.getCoffee();
    }
}
