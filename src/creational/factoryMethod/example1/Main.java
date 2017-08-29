package creational.factoryMethod.example1;


import creational.factoryMethod.example1.implementations.BarChartResultCreator;
import creational.factoryMethod.example1.implementations.LineChartResultCreator;
import creational.factoryMethod.example1.interfaces.Data;
import creational.factoryMethod.example1.interfaces.ResultCreator;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();

        ResultCreator lineChart = new LineChartResultCreator();
        lineChart.create(data);

        ResultCreator barChart = new BarChartResultCreator();
        barChart.create(data);



    }
}
