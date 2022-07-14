package Algo;

public class EnhancedForLoop {
            /*    
    for(elementType value: arrayRefVar){
        //process the value
    }
        */
    static void fillArray(double[] array){
        //value is a position in values : 0 to <values.lenth, it's not values[index], so we need an index
        int index = 0;
        for(double v: array)
            array[index++] = (double) (Math.random() * 10);
        }
        
    public static void main(String[] args) {
        double[] values = new double[10];
        
        fillArray(values);
        for(double v: values)  
            System.out.println(v);
        
    }
}
