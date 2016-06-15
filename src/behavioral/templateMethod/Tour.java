package behavioral.templateMethod;


public abstract class Tour {

    public void makeTour(){
        prepare();
        travel();
        comeBack();
    }

    protected abstract void comeBack();

    protected abstract void travel();

    protected abstract void prepare();
}
