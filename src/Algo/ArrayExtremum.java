package Algo;

import java.util.Scanner;


public class ArrayExtremum {
    
    static double maxValue(double[] array){
        double max = array[0];
        int index = 0;
        for(int k = 0 ; k < array.length; k++){
            if(max < array[k]){
                max = array[k];
                index = k;
            }
        }
        System.out.println("\n max+: "+max+"found at index = "+index);
        return max;
    }
    
    static double minValue(double[] array){
        double min = array[0];
        int index = 0;
        for(int k = 0 ; k < array.length; k++){
            if(min > array[k]){
                min = array[k];
                index = k;
            }
        }
        System.out.println("\n min: "+min+"found at index = "+index);
        return min;
    }
    
    public static void main(String[] args) {
        double[] values;
        int size;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size: "); size = scan.nextInt();
        values = new double[size];
        
        for(int k = 0 ; k < values.length; k++){
            values[k] = (double) (Math.random() * 40);
            System.out.print(values[k]+"  ");
        }
        maxValue(values);
        minValue(values);
//       System.out.println("\nMax value: "+maxValue(values));   
//       System.out.println("Min value: "+minValue(values));
    
}
}