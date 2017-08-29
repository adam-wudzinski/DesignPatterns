package creational.factoryMethod.example1.implementations;


import creational.factoryMethod.example1.interfaces.Chart;
import creational.factoryMethod.example1.interfaces.Data;

public class LineChart extends Chart {
    public LineChart(Data data) {
        super(data);
    }
}
