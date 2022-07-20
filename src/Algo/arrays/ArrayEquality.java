package Algo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {
    //check the content equality, no matter the order
    public static boolean EqualArrays(int[] list1, int[] list2){
       boolean flag = true;
       Arrays.sort(list1);
       Arrays.sort(list2);
       if(list1.length == list2.length){
           for(int i = 0; i < list1.length; i++){
               if(list1[i] != list2[i]){
                   flag = false; break;
                }
           }
       }
       else flag = false;
       
       return flag;
    }
    
    public static void main(String[] args) {
        int size;
        int[] list1, list2;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size: "); size = scan.nextInt();
        list1 = new int[size];
        list2 = new int[size];
        
        System.out.print("please, fill the list1: ");
        for(int i = 0; i < list1.length; i++)
                list1[i] = scan.nextInt();
        System.out.print("please, fill the list2: ");
        for(int i = 0; i < list2.length; i++)
                list2[i] = scan.nextInt();       
        
        System.out.print("list1 and list2 are equal: "+EqualArrays(list1, list2));
        
    }
    
}
