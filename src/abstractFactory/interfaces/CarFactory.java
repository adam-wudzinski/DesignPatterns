package abstractFactory.interfaces;

import java.util.List;

public interface CarFactory {
    Engine createngine();
    Exhaust createExhaust();
    Wheel createWheels();
}
