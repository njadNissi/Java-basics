/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

/**
 *
 * @author hp
 */
public class AproximatingE {
  
    public static double approximatingE(double precision){
        double lastden = 1, e = 1;
        for (int i = 1; 1.0/lastden >= precision ; i++) {
            lastden *= i;          
            e += 1/lastden;
        }
        return e;
    }
    public static void main(String[] args) { 
        double precision;
        
        System.out.println("the aproximated value of e is : "+approximatingE(100));
    }
}
