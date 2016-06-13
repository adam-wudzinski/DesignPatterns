package factoryMethod;


import factoryMethod.implementations.BarChartResultCreator;
import factoryMethod.implementations.LineChartResultCreator;
import factoryMethod.interfaces.Data;
import factoryMethod.interfaces.ResultCreator;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();

        ResultCreator lineChart = new LineChartResultCreator();
        lineChart.create(data);

        ResultCreator barChart = new BarChartResultCreator();
        barChart.create(data);



    }
}
