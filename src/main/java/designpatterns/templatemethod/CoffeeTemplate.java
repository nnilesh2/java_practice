package designpatterns.templatemethod;

public abstract class CoffeeTemplate {

    final void prepateCoffee(){
        takeWater();
        AddCoffee();
        AddMilk();
        AddSugar();
        System.out.println("Coffee Prepared ...");
    }

    void takeWater(){
        System.out.println("Take Hot Water ...");
    };
    void  AddCoffee(){
        System.out.println("Add Coffee...");
    }
    abstract void  AddMilk();
    abstract void AddSugar();
    
}
