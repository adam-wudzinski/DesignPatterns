package creational.factoryMethod;


import creational.factoryMethod.implementations.BarChartResultCreator;
import creational.factoryMethod.implementations.LineChartResultCreator;
import creational.factoryMethod.interfaces.Data;
import creational.factoryMethod.interfaces.ResultCreator;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();

        ResultCreator lineChart = new LineChartResultCreator();
        lineChart.create(data);

        ResultCreator barChart = new BarChartResultCreator();
        barChart.create(data);



    }
}
