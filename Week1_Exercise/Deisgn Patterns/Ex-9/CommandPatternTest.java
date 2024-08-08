public class CommandPatternTest {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        // Turn on the light
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();

        // Turn off the light
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();
    }
}