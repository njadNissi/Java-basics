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

    static int decToBinRec(int dec) {
        if (dec == 0) {
            return 0;
        } else {
            return (dec % 2) + (10 * (decToBinRec(dec / 2)));
        }
    }

    static String decToBin(int decimalValue) {
        String binary = "";
        //getting the mods of each half
        while (decimalValue != 0) {
            binary = Integer.toString(decimalValue % 2) + binary;
            decimalValue /= 2;
        }
        return binary;
    }

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
                    System.out.println(" Binary: " + decToBinRec(decimal));
            }
            System.out.println();
        }
    }
}
