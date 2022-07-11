package Algo;

import java.util.Scanner;

public class ArrayShuffling {
    
    static void fillArray(double[] array){
        for(int k = 0 ; k < array.length; k++){
            array[k] = (double) (Math.random() * 10);
            System.out.print(array[k]+"  ");
        }
        System.out.println("");
    }
    
    static void shuffleValues(double[] array){
        
        for(int k = 0 ; k < array.length; k++){
            int newIndex = (int) (Math.random()* array.length);
            double temp = array[k];
            array[k] = array[newIndex];
            array[newIndex] = temp;
//            System.out.print(array[newIndex]+"  ");
        }
        for(int k = 0; k < array.length; k++)
            System.out.println(array[k]+" ");
    }
    
    public static void main(String[] args) {
        double[] values;
        int size;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size: "); size = scan.nextInt();
        values = new double[size];
        /*step 1*/fillArray(values);
        /*step 2*/shuffleValues(values);  
    }
}
