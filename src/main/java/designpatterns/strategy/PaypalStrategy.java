package designpatterns.strategy;

public class PaypalStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment doen with Paypal....");
    }
}
