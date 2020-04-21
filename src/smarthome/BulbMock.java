package smarthome;

import static org.junit.Assert.assertEquals;

public class BulbMock implements Bulb {

    private boolean turnOn_wasCalled = false;
    private boolean turnOff_wasCalled = false;

    @Override
    public void turnOn() {
        turnOn_wasCalled = true;
    }

    @Override
    public void turnOff() {
        turnOff_wasCalled = true;
    }

    public void verifyBulbTurnedOn() {
        assertEquals(true, turnOn_wasCalled);
        assertEquals(false, turnOff_wasCalled);
    }

    public void verifyBulbTurnedOff() {
        assertEquals(false, turnOn_wasCalled);
        assertEquals(true, turnOff_wasCalled);
    }
}
