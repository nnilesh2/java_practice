package designpatterns.singleton;

public class Singleton implements Cloneable{

    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    protected Singleton clone () throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    
}
