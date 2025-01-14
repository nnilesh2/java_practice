package designpatterns.strategy;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment doen with Crdit Card....");
    }
}
