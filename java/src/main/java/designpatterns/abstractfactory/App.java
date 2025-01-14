package designpatterns.abstractfactory;

public class App {
    public static void main(String[] args) {
        GUIFactory guiFactory = new WinFactory();
        Button button = guiFactory.createButton();
        button.paint();;
    }
}
