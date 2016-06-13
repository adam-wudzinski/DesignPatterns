package structural.decorator;


public class ConcreteDecorator extends GreetingDecorator {
    public ConcreteDecorator(IGreeting greeting) {
        super(greeting);
    }

    @Override
    public void display() {
        displayDecoration();
        super.display();
        displayDecoration();
    }

    private void displayDecoration() {
        System.out.println("-----------");
    }
}
