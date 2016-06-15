package behavioral.chainOfResponsibility;


public class MercedesMechanic extends Mechanic{

    @Override
    public void handle(Car car) {
        if (car.getBrand().equals(Brand.MERCEDES)) {
            System.out.println("Mercedes mechanic: It's my job");
        }
        else {
            System.out.println("Mercedes mechanic: It's not my job");
            succesor.handle(car);
        }
    }
}
