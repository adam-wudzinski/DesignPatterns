package creational.factoryMethod.example1.implementations;


import creational.factoryMethod.example1.interfaces.Chart;
import creational.factoryMethod.example1.interfaces.Data;

public class BarChart extends Chart{
    public BarChart(Data data) {
        super(data);
    }
}
