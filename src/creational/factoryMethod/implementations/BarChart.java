package creational.factoryMethod.implementations;


import creational.factoryMethod.interfaces.Chart;
import creational.factoryMethod.interfaces.Data;

public class BarChart extends Chart{
    public BarChart(Data data) {
        super(data);
    }
}
