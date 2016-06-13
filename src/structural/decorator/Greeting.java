package structural.decorator;


public class Greeting implements IGreeting{
    @Override
    public void display() {
        System.out.println("Hello");
    }
}
