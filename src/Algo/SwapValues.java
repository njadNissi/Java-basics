package Algo;

import java.util.Arrays;

public class SwapValues {

    static void swap1(int[] numbers, int ind1, int ind2) {
        numbers[ind1] += numbers[ind2];
        numbers[ind2] = numbers[ind1] - numbers[ind2];
        numbers[ind1] -= numbers[ind2];
    }
    static void swap2(int[] numbers, int ind1, int ind2) {
        numbers[ind1] *= numbers[ind2];
        numbers[ind2] = numbers[ind1] / numbers[ind2];
        numbers[ind1] /= numbers[ind2];
    }

    static void swap3(int[] numbers, int ind1, int ind2) {
        int temp   = numbers[ind1];
        numbers[ind1] = numbers[ind2];
        numbers[ind2] = temp;
    }
    static void swap4(int[] numbers, int ind1, int ind2) {
        numbers[ind1] = numbers[ind1] ^ numbers[ind2];
        numbers[ind2] = numbers[ind1] ^ numbers[ind2];
        numbers[ind1] = numbers[ind1] ^ numbers[ind2];
    }

    static void swap5(int[] numbers, int ind1, int ind2) {
        numbers[ind1] += (numbers[ind2] - (numbers[ind2] = numbers[ind1]));
    }
    static void swap6(int[] numbers, int ind1, int ind2) {
        numbers[ind1] = numbers[ind1] ^ numbers[ind2] ^ (numbers[ind2] = numbers[ind1]);
    }

    public static void main(String[] args) {

        int numbers[] = {255, 14, 73, 92, 20, 6, 10, 100, -11, 50, 0};
        int i = 2, j = 6;

        swap6(numbers, i, j);
        System.out.println(Arrays.toString(numbers));

    }
}
