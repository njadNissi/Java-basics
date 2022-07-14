/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import java.util.Arrays;

/**
 *
 * @author njad
 */
public class simpleSieve {
   
    /**This functions finds all primes smaller than 'limit'
        using simple sieve of Eratosthenes.*/

    static void simpleSieve(int limit) {

        /** Create a boolean array "mark[0..limit-1]" and
         initialize all entries of it as true. A value
         in mark[p] will finally be false if 'p' is Not
         a prime, else true.*/
        boolean[] mark = new boolean[limit];
        Arrays.fill(mark, true);

        /** One by one traverse all numbers so that their
         multiples can be marked as composite.*/
        for (int p = 2; p * p < limit; p++) {
            // If p is not changed, then it is a prime
            if (mark[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i < limit; i += p) {
                    mark[i] = false;
                }
            }
        }

        // Print all prime numbers and store them in prime
        for (int p = 2; p < limit; p++) {
            if (mark[p] == true) {
                System.out.print(p + " ");
            }
        }
    }

    public static void main(String[] args) {
        simpleSieve(10);
    }

}
