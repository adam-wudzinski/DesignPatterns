package creational.factoryMethod.example1.implementations;


import creational.factoryMethod.example1.interfaces.Chart;
import creational.factoryMethod.example1.interfaces.Data;
import creational.factoryMethod.example1.interfaces.ResultCreator;

public class LineChartResultCreator extends ResultCreator {
    @Override
    protected Chart getChartRepresentation(Data data) {
        return new LineChart(data);
    }
}
