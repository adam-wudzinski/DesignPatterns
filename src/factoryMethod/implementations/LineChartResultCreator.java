package factoryMethod.implementations;


import factoryMethod.interfaces.Chart;
import factoryMethod.interfaces.Data;
import factoryMethod.interfaces.ResultCreator;

public class LineChartResultCreator extends ResultCreator {
    @Override
    protected Chart getChartRepresentation(Data data) {
        return new LineChart(data);
    }
}
