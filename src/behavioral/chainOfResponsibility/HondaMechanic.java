package behavioral.chainOfResponsibility;


public class HondaMechanic extends Mechanic {

    @Override
    public void handle(Car car) {
        if (car.getBrand().equals(Brand.HONDA)) {
            System.out.println("Honda mechanic: It's my job");
        }
        else {
            System.out.println("Honda mechanic: It's not my job");
            succesor.handle(car);
        }
    }
}
