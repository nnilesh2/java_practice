package designpatterns.strategy;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new GooglePayStrategy());
        cart.checkout();
    }
}
