package behavioral.chainOfResponsibility;


public abstract class Mechanic {
    protected Mechanic succesor;

    public void setSuccesor(Mechanic succesor){
        this.succesor = succesor;
    }

    public abstract void handle(Car car);

}
