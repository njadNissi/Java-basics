package Algo;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size = 0 , i = 0;
        int[] num = new int[size];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size: ");
        size = scan.nextInt();
        System.out.println("enter "+size+" numbers: ");

        while(num.length > i){ //reading numbers
            num[i] = scan.nextInt();
            i++;
        }
        //switching process with loop
        for(i = 0; i < num.length; i++){
            for(int j = i+1; j <num.length; j++){
            if(num[i] > num[j]){
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                }
            }
        }
        //printing the sorted array
        for(i = 0; i < num.length ; i++){
            System.out.println(num[i]+" ");
        }
    }
}
