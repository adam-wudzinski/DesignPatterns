package structural.adapter;


public class Client {

    public static void main(String[] args) {
        MultifunctionalDevice deviceToAdapt = new MultifunctionalDevice();
        Device adapter = new SimpleDevice(deviceToAdapt);
        adapter.turnOff();
        adapter.turnOn();
    }
}
