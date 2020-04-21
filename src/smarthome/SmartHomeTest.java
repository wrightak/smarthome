package smarthome;

import org.junit.Test;

public class SmartHomeTest {

    @Test
    public void test_switchIsOn_turnBulbOn() {
        Switch alwaysOnSwitch = new AlwaysOnSwitch();
        BulbMock bulbMock = new BulbMock();

        new SmartHome(alwaysOnSwitch, bulbMock).run();

        bulbMock.verifyBulbTurnedOn();
    }

    @Test
    public void test_switchIsOff_turnBulbOff() {
        Switch alwaysOffSwitch = new AlwaysOffSwitch();
        BulbMock bulbMock = new BulbMock();

        new SmartHome(alwaysOffSwitch, bulbMock).run();

        bulbMock.verifyBulbTurnedOff();
    }

}

