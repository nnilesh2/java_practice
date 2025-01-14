package designpatterns.state;

public class RedLightState implements TrafficLightState{

    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Red Light, Stop");
        context.setState(new GreenlightState());
    }

    
}