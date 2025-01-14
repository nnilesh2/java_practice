package designpatterns.state;

public class GreenlightState implements TrafficLightState{

    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Green Light, Go Ahead...");
        context.setState(new YellowLightState());
    }
    
}
