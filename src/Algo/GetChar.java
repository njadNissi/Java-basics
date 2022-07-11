package Algo;

import java.io.IOException;

public class GetChar {

    public static void printPrevious() {
        System.out.println("you pressed previous...");
    }

    public static void printNext() {
        System.out.println("you pressed next...");
    }

    public static void main(String[] args) throws IOException {
        char ch = 'c';
        System.out.println("test the 'p' and 'n' buttons: \n--------------------------------");

        while (ch != ' ') {
            ch = (char) System.in.read();
            switch (ch) {
                case 'p':
                    printPrevious();
                    break;
                case 'n':
                    printNext();
                    break;
            }
        }
    }

}
