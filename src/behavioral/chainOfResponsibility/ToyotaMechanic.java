package behavioral.chainOfResponsibility;


public class ToyotaMechanic extends Mechanic {
    @Override
    public void handle(Car car) {
        if (car.getBrand().equals(Brand.TOYOTA)) {
            System.out.println("Toyota mechanic: It's my job");
        }
        else {
            System.out.println("Toyota mechanic: It's not my job");
            succesor.handle(car);
        }
    }
}
