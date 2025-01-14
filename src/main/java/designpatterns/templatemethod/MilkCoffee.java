package designpatterns.templatemethod;

public class MilkCoffee extends CoffeeTemplate{

    @Override
    void AddMilk() {
       System.out.println("Add Milk...");
    }

    @Override
    void AddSugar() {
       System.out.println("Add Sugar ...");
    }
    
}
