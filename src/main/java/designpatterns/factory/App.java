package designpatterns.factory;

public class App {
    public static void main(String[] args) {
        Shape shape  = ShapeFactory.drawShape("Circle");
        shape.draw();
    }
}
