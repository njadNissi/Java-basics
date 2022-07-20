package Algo.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array2D {

    static void fillArrayWithRandomNumbers(double[][] array) {
        /**Filling the 2D array with random numbers*/
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++)
                array[i][j] = random.nextInt(-99, 99);
    }

    static void printWithForLoop(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                System.out.print(array[i][j] + "        ");
            System.out.println("\n------------------------------------------------------------------------------------------------------------------");
        }
    }

    static void printWithEnhancedForLoop(double[][] array) {
        for (double[] row : array) {
            for (double col : row)
                System.out.print(col + "        ");
            System.out.println("\n------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 10, cols = 10;

        System.out.print("enter number of rows = ");
        rows = Math.abs(scanner.nextInt());

        System.out.print("enter number of columns = ");
        cols = Math.abs(scanner.nextInt());

        double[][] numbers = new double[rows][cols];

        fillArrayWithRandomNumbers(numbers);

        /**make some changes*/
        /**Access the first element at row=0 and column = 0 and change it to 25*/
        numbers[0][0] = 25;
        /**Access the last element. Indexes go from 0 to length - 1.
         * rows = numbers.length and cols = numbers[x].length*/
        numbers[numbers.length - 1][numbers[0].length - 1] = -25;

        /**Do the printings*/
        System.out.println("Printed with For Loop:");
        printWithForLoop(numbers);

        System.out.println("Printed with enhanced-For loop");
        printWithEnhancedForLoop(numbers);
    }
}
