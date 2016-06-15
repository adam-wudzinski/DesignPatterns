package behavioral.chainOfResponsibility;


public class Car {
    private Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }
}
