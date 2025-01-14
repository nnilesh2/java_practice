package designpatterns.visitor;

public class App {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Food milk = new Food(10.0);
        Liquor vodka = new Liquor(11.0);
        Book book = new Book(20.0);

        milk.accept(taxVisitor);
        vodka.accept(taxVisitor);
        book.accept(taxVisitor);
    }
}
