package creational.abstractFactory.interfaces;

public interface CarFactory {
    Engine createngine();
    Exhaust createExhaust();
    Wheel createWheels();
}
