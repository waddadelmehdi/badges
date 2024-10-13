// A concrete command to turn on a device
public class TurnOnCommand implements Command {

    private Device device;

    // Constructor to set the device
    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}

// A concrete command to turn off a device
public class TurnOffCommand implements Command {

    private Device device;

    // Constructor to set the device
    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
