package structural.decorator;


public class GreetingDecorator implements IGreeting {

    private IGreeting greeting;

    public GreetingDecorator(IGreeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void display() {
        greeting.display();
    }
}
