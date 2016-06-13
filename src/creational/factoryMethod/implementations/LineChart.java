package creational.factoryMethod.implementations;


import creational.factoryMethod.interfaces.Chart;
import creational.factoryMethod.interfaces.Data;

public class LineChart extends Chart {
    public LineChart(Data data) {
        super(data);
    }
}
