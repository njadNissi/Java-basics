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
public class MainMethodDemo {
    public static void main(String[] args) {
        /**
         * 1. go to cmd and compile this class: javac MainMethodDemo.java
         * 2. and execute with: java MainMethodDemo arg1 arg2 arg3 and so on
         */
//        freeRun(args);
        conditionedRun(args);
    }
    
    static void freeRun(String ... args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("args # = "+args.length);
    }
    
     static void conditionedRun(String ... args){
         if(args.length == 3)
             System.out.println("The program is running now!");
    }
}
