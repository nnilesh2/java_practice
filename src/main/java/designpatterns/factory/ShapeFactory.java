package designpatterns.factory;

public class ShapeFactory{

    public static Shape drawShape(String name){
        if("Circle".equals(name)){
            return new Circle();
        }else if ("Square".equals(name)) {
            return new Square();
        }
        return null;
    }    
    
}
