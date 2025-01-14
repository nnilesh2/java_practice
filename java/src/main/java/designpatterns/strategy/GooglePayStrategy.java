package designpatterns.strategy;

public class GooglePayStrategy implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Payment doen with Google Pay....");
    }
    
}
