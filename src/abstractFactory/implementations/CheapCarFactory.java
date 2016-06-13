package abstractFactory.implementations;


import abstractFactory.interfaces.CarFactory;
import abstractFactory.interfaces.Engine;
import abstractFactory.interfaces.Exhaust;
import abstractFactory.interfaces.Wheel;

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
