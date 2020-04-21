package smarthome;

public class AlwaysOffSwitch implements Switch {

    @Override
    public Boolean isOn() {
        return false;
    }
}
