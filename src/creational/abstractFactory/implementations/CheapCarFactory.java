package creational.abstractFactory.implementations;


import creational.abstractFactory.interfaces.CarFactory;
import creational.abstractFactory.interfaces.Engine;
import creational.abstractFactory.interfaces.Exhaust;
import creational.abstractFactory.interfaces.Wheel;

public class CheapCarFactory implements CarFactory{

    @Override
    public Engine createngine() {
        return new CheapEngine();
    }

    @Override
    public Exhaust createExhaust() {
        return new CheapExhaust();
    }

    @Override
    public Wheel createWheels() {
        return new CheapWheel();
    }
}
