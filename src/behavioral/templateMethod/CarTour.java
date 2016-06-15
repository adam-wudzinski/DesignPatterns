package behavioral.templateMethod;


public class CarTour extends Tour{

    @Override
    protected void comeBack() {
        System.out.println("Return by car");
    }

    @Override
    protected void travel() {
        System.out.println("Travel by car");
    }

    @Override
    protected void prepare() {
        System.out.println("Prepare to car tour");
    }
}
