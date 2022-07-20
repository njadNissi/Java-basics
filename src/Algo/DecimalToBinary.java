package Algo;

import java.util.Scanner;

public class DecimalToBinary {

    static int binToDec(String strBinary, int a) {
        int size = strBinary.length();
        if (a == size - 1) {
            return strBinary.charAt(a) - '0';
        }
        return ((strBinary.charAt(a) - '0') << (size - a - 1)) + binToDec(strBinary, a + 1);
    }

    static int decToBinRecursive(int dec) {
        if (dec == 0)
            return 0;
        else
            return (dec % 2) + (10 * (decToBinRecursive(dec / 2)));
    }

    /**
     * positive and Negative decimals all supported
     * and number of bits is up to choice.
     */
    static String decToBin(int decimalValue) {
        String binary = "";
        //getting the mods of each half
        while (decimalValue != 0) {
            binary = Integer.toString(decimalValue % 2) + binary;
            decimalValue /= 2;
        }
        return binary;
    }

    static String decToBin(int digitsNo, int number) {
        /** N >> x operator gets the bit at pos x from the binary of the number N*/
        StringBuilder binary = new StringBuilder();
        for (int i = digitsNo; i >= 0; i--)
            binary.append(String.valueOf((number >> i) & 1));
        return binary.toString();
    }

    /**
     * negative decimals Unsupported
     * number of bits is the necessary.
     */
    static int binToDec(int binaryNumber) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }
        return decimal;
    }

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    C O N V E R S O R\n---------------------------------------------");
        while (true) {
            System.out.print("Options\n-------------------\n�1 BIN-->DEC \n�2 DEC-->BIN\n  choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int binary;
                    System.out.print("  Binary to Decimal\n Bits: ");
                    binary = scanner.nextInt();
                    System.out.println(" Decimal: " + binToDec(binary));
                case 2:
                    int decimal = 0;
                    System.out.print("  Decimal to Binary\n Number: ");
                    decimal = scanner.nextInt();
                    System.out.println(" Binary: " + decToBin(decimal));
                    System.out.println(" Binary: " + decToBinRecursive(decimal));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println(decToBin(4, -10));
        System.out.println(decToBin(-10));

    }
}
