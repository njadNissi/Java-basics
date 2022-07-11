/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

/**
 *
 * @author njad
 */
public class Fibonacci_sum {
    /**
     fib(num) = fib(num - 1) + fib(num - 2)
     * @param termsNo
     * @return 
     */
    public static double fibRecursionOf(int termsNo){
        if(termsNo <= 2)
            return 1;
        else
            return (fibRecursionOf(termsNo - 2) + fibRecursionOf(termsNo - 1));
    }
   public static void fibProgression(int count){
        for (int i = 1; i <= count; i++) 
            System.out.print(fibRecursionOf(i)+" + ");
   }
    public static void main(String[] args) {
        int term = 10;
        fibProgression(term);
        System.out.println("\nlast term of fib("+(term)+") = "+fibRecursionOf(50));
    }
}
