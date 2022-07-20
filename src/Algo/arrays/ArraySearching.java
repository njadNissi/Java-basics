package Algo.arrays;

import java.util.Scanner;

public class ArraySearching {
    public static int linearSearching(int[] array, int key){
        int pos = -1, flag = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                flag = 1; 
                pos = i;
            }
            }
        return pos;
    }
    private static int[] sortArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
    }
        return array;
    }
    
    public static int binarySearching(int[] array, int key){
       // Arrays.sort(array);
        int flag = -1;
        int bottom = 0, top = array.length - 1;
        int mid = 0;
        
        while(array[mid] != key && bottom < top){
            mid = (bottom + top )/2;
          if(key < array[mid]){
              top = mid-1; 
          }
          else if(key > array[mid]){
                bottom = mid+1;      
          }
          else flag = mid;
        }
      return flag;         
    }
    
    public static void main(String[] args) {
        int key;
        int[] array1 = {25, 46, 82, 15, 73, 69, 152, 70, 5, 7, 369};
        int[] array2 = {5, 7, 15, 25, 46, 69, 70, 73, 82, 152, 369};
        
        Scanner scan = new Scanner(System.in);
        
        for(int v: array1)
            System.out.print(v+"  "); System.out.println("");
            System.out.print("enter the key: ");  key = scan.nextInt();
        
        if(linearSearching(array1, key) == -1) System.out.println("element not found!");    
        else System.out.println("Linear=>found at: array["+linearSearching(array1, key)+"]");
        
        if(binarySearching(array2, key) == -1) System.out.println("element not found!");    
        else System.out.println("binary==>found at: array["+binarySearching(array1, key)+"]");
        
//        for(int i = 0; i < array1.length; i++){
//            System.out.print(sortArray(array1)[i]+" "); 
//    }
    }   
}
