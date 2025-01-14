package designpatterns.visitor;

public class Book implements Visitable{

    private double price;

    /**
     * @param price
     */
    public Book(double price) {
        this.price = price;
    }    

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

}
