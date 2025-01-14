package designpatterns.state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    /**
     * @param currentState
     */
    public TrafficLightContext() {
        this.currentState = new RedLightState();
    }

    public void setState(TrafficLightState state){
        this.currentState = state;
    }

    public void changeState(){
        currentState.handleState(this);
    }
}
