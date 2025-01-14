package designpatterns.visitor;

public class TaxVisitor implements Visitor{

    @Override
    public double visit(Food food) {
        double tax = food.getPrice()*0;
        System.out.println("Food Item Price : "+food.getPrice()+" Tax on Food Item : "+tax);
        return food.getPrice() + tax;
    }

    @Override
    public double visit(Liquor liquor) {
        double tax = liquor.getPrice()*0.30;
        System.out.println("Liquor Item Price : "+liquor.getPrice()+" Tax on Food Item : "+tax);
        return liquor.getPrice() + tax;
    }

    @Override
    public double visit(Book book) {
        double tax = book.getPrice()*0.1;
        System.out.println("Book Item Price : "+book.getPrice()+" Tax on Food Item : "+tax);
        return book.getPrice() + tax;
    }
    
}
