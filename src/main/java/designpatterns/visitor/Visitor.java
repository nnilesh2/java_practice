package designpatterns.visitor;

public interface Visitor {
    double visit(Food food);
    double visit(Liquor liquor);
    double visit(Book book);
}
