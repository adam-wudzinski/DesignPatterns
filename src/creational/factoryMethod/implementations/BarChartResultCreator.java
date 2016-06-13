package creational.factoryMethod.implementations;


import creational.factoryMethod.interfaces.Chart;
import creational.factoryMethod.interfaces.Data;
import creational.factoryMethod.interfaces.ResultCreator;

public class BarChartResultCreator extends ResultCreator{
    @Override
    protected Chart getChartRepresentation(Data data) {
        return new BarChart(data);
    }
}
