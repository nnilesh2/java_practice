package designpatterns.command;

public class RemoteControl {

    private Command command;

    /**
     * @param command
     */
    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();;
    }
    
}
