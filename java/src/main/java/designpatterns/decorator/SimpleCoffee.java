package designpatterns.decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public void getCoffee() {
        System.out.println("Preparing Simple Coffee....");
    }


}
