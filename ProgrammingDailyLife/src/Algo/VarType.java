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
public class VarType {
     
    public static void main(String[] args) {
        var z = 19;
        System.out.println(Math.pow(z, 3));
        
        var n = new Double[5];
        
        var v = 1.0;
        for (var i = 0; i < n.length; i += 1)
            n[i] = Math.pow((v+i), (i));
        
        for(Double d : n)
            System.out.print(d+" ");
    }
    
}
