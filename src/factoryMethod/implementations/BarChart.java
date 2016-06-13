package factoryMethod.implementations;


import factoryMethod.interfaces.Chart;
import factoryMethod.interfaces.Data;

public class BarChart extends Chart{
    public BarChart(Data data) {
        super(data);
    }
}
