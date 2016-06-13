package factoryMethod.implementations;


import factoryMethod.interfaces.Chart;
import factoryMethod.interfaces.Data;

public class LineChart extends Chart {
    public LineChart(Data data) {
        super(data);
    }
}
