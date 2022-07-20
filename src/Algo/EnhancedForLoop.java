package Algo;

public class EnhancedForLoop {

    static void fillArrayWithRandomNumbers(double[] array){
        //value is a position in values : 0 to <values.lenth, it's not values[index], so we need an index
        int index = 0;
        for(double v: array)
            array[index++] = (double) (Math.random() * 10);
        }
        
    public static void main(String[] args) {
        double[] values = new double[10];

        fillArrayWithRandomNumbers(values);

        for(double value: values)
            System.out.println(value);
        
    }
}
