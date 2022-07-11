package Algo;

public class SumOfSequence {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i < 100; i+=2) {
            sum += i;
            if(i < 99) System.out.print(i+"+"); 
            if(i == 99) System.out.println(i+" = "+sum);
        }
    }
}