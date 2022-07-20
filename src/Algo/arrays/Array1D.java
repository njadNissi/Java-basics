package Algo.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array1D {

    static void fillArrayWithRandomNumbers(double[] array) {
        /**Filling the 1D array with random numbers*/
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(-99, 99);
    }

    static void printWithForLoop(double[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "        ");
    }

    static void printWithEnhancedForLoop(double[] array) {
        for (double cell : array)
            System.out.print(cell + "        ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cells = 100;

        System.out.print("enter number of cells = ");
        cells = Math.abs(scanner.nextInt());
        double[] numbers = new double[cells];

        fillArrayWithRandomNumbers(numbers);

        System.out.println("Printed with For Loop:");
        /* Indexes go from 0 to length - 1.*/
        /** Access the first element -> index = 0 and change it to 25*/
        numbers[0] = 25.0;
        /** Access the last element-> index = length - 1 and change it to 25*/
        numbers[numbers.length - 1] = -25;

        /**Do the printings*/
        printWithForLoop(numbers);

        System.out.println();

        System.out.println("Printed with enhanced-For loop");
        printWithEnhancedForLoop(numbers);
    }
}
