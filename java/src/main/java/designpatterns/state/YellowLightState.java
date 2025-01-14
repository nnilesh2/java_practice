package designpatterns.state;

public class YellowLightState  implements TrafficLightState{

    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Yellow light, Prepare to Stop");
        context.setState(new RedLightState());
    }
    
}
