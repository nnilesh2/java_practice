package designpatterns.visitor;

public interface Visitable {
    double accept(Visitor visitor);    
}
