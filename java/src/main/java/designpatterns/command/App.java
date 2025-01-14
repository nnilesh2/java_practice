package designpatterns.command;

public class App {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new LightOffCommand(new Light()));
        remoteControl.pressButton();
    }
}
