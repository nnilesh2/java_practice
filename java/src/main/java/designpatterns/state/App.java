package designpatterns.state;

public class App {

    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        context.changeState();
        context.changeState();
        context.changeState();
        context.changeState();
    }
}