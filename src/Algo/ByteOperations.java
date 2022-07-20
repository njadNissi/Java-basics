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
public class ByteOperations {

    static String twosComplement(String bin){
        /**One's complement*/
        StringBuilder onesComplement = new StringBuilder();
        for(char c : bin.toCharArray())
            onesComplement.append(~c);
        return Integer.toBinaryString(Integer.parseInt(onesComplement.toString()) + 1);
    }
    
    static int inverseBit(int bit){
        if(bit == 0)
            return 1;
        else if(bit == 1)
            return 0;
        return 0;
    }
        
    static int[] twosComplement(int[] bin){
        int posOfFirst1FromLsb = -1;
        int[] twoscomp = new int[bin.length];
        
        /**store all bits until the first 1 from least significant bit*/
        for (int i = bin.length - 1; i >= 0; i--){
            twoscomp[i] = bin[i];
            if(bin[i] == 1){
                posOfFirst1FromLsb = i;
                break;
            }
        }
        if(posOfFirst1FromLsb > -1)
            for (int i = 0; i < posOfFirst1FromLsb; i++) 
                twoscomp[i] = inverseBit(bin[i]);
        
        return twoscomp;
    }
    
    public static void main(String[] args) {
        Integer i = 64;
        Byte b64 = i.byteValue();
       
        System.out.println(b64 + " = ["+ Integer.toBinaryString(i) +"]");
        
        /**bit wise operation ~*/
        System.out.println('A' - 0);
//        System.out.println(twosComplement(Integer.toBinaryString(i)));
        
        //shift left by 2 bits : 1000000(64) => 100000000 (256)
        System.out.println("shift left by 2 bits: ["+Integer.toBinaryString(b64 << 2) +"]");
        
        //shift right by 2 bits : 1000000(64) => 0010000 (16)
        System.out.println("shift right by 2 bits: ["+Integer.toBinaryString(b64 >> 2) +"]");
        
        //Arithmetic shift right by 2 bits : 1000000(64) => 0010000 (16)
        System.out.println("arithmetic shift right by 2 bits: ["+Integer.toBinaryString(b64 >>> 2) +"]");
    }
    
}
