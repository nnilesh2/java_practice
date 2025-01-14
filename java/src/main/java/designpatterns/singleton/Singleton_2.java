package designpatterns.singleton;

public class Singleton_2 {

    private static class InnerSingleton {
        private static Singleton_2 instance = new Singleton_2();
    }

    public static Singleton_2 getInstance(){
        return InnerSingleton.instance;
    }
}
