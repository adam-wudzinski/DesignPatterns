package behavioral.chainOfResponsibility;


public class Main {

    public static void main(String[] args) {
        Mechanic hondaMechanic = new HondaMechanic();
        Mechanic toyotaMechanic = new ToyotaMechanic();
        Mechanic mercedesMechanic = new MercedesMechanic();
        hondaMechanic.setSuccesor(toyotaMechanic);
        toyotaMechanic.setSuccesor(mercedesMechanic);

        Car brokenHonda = new Car(Brand.HONDA);
        Car brokenToyota = new Car(Brand.TOYOTA);
        Car brokenMercedes = new Car(Brand.MERCEDES);

        System.out.println("-- Broken honda:");
        hondaMechanic.handle(brokenHonda);
        System.out.println("-- Broken toyota:");
        hondaMechanic.handle(brokenToyota);
        System.out.println("-- Broken mercedes:");
        hondaMechanic.handle(brokenMercedes);
    }
}
