package structural.adapter;


public class SimpleDevice implements Device {
    private MultifunctionalDevice mDevice;

    public SimpleDevice(MultifunctionalDevice mDevice) {
        this.mDevice = mDevice;
    }

    @Override
    public void turnOn() {
        mDevice.turnOn();
    }

    @Override
    public void turnOff() {
        mDevice.turnOff();
    }
}
