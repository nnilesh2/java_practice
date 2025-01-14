package designpatterns.abstractfactory;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }
    
}
