
package Algo;

import java.util.Scanner;

public class ArrayMidValue { 
    
    static float calculateAverage(float[] numbers){
        float average = 0;
        for(int i = 0; i < numbers.length; i++){
            average += numbers[i];
        }
        average /= numbers.length;
        
        return average;
    }
    
    public static void main(String[] args) {
        float[] values;
        int size ;
        float average;
        Scanner  scan = new Scanner(System.in);
        
        System.out.print("set size: "); size = scan.nextInt(); values = new float[size]; 
        System.out.print("enter the values: ");
        for(int i = 0; i < values.length; i++)
            values[i] = scan.nextFloat();
        
        average = calculateAverage(values);System.out.println(" values > average\n____________________");
        for(int i = 0; i < values.length; i++)
            if(values[i] > average)
                System.out.print(values[i]+"    ");
    }
}
