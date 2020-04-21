package smarthome;

public class SmartHome {
    private final Switch aSwitch;
    private final Bulb bulb;

    public SmartHome(Switch aSwitch, Bulb bulb) {
        this.aSwitch = aSwitch;
        this.bulb = bulb;
    }

    public void run() {
        if (aSwitch.isOn()) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}
