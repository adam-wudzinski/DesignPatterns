package behavioral.templateMethod;


public class BusTour extends Tour {

    @Override
    protected void comeBack() {
        System.out.println("Return by bus");
    }

    @Override
    protected void travel() {
        System.out.println("Travel by bus");
    }

    @Override
    protected void prepare() {
        System.out.println("Prepare to bus tour");
    }
}
