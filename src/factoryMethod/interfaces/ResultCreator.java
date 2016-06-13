package factoryMethod.interfaces;


public abstract class ResultCreator {

    public Chart create(Data data) {
        Chart chart = getChartRepresentation(data);
        return chart;
    }

    protected abstract Chart getChartRepresentation(Data data);
}
