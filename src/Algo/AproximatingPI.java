/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class AproximatingPI {
    public static void main(String[] args) { 
        double PI = 0; int input;

        Scanner scan = new Scanner(System.in);
         input = scan.nextInt();
        
        for(int i = 0; i < input; i++){
            PI += Math.pow(-1.0, 2*i + 1.0)/(2 * i - 1.0); 
        }
        
      /*
      for(double i = 0; i < input; i++ ){
          if(i%2 == 0)
              PI += 1.0 / (2 * i + 1.0);
          else
              PI += -1.0 / (2 * i + 1.0);
      }
    */
         System.out.println("the aproximated value of PI is : "+4*PI);
    }
}
