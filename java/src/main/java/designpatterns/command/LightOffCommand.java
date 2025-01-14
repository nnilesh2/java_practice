package designpatterns.command;

public class LightOffCommand implements Command{

    private Light light;

    

    /**
     * @param light
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }



    @Override
    public void execute() {
        light.off();
    }
    
}
