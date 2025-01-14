package designpatterns.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    /**
     * @param paymentStrategy
     */
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(){
        paymentStrategy.pay();
        System.out.println("Payment Successful, checking out...");
    }
    
}
