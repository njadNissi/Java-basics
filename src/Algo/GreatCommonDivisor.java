package Algo;

import java.util.Scanner;

public class GreatCommonDivisor {
    
    public static void main(String[] args) {
    
        int size = 0;
        int[] num ;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter sequence length: "); size = scan.nextInt();
        num = new int[size];
        System.out.print("enter "+size+" numbers: ");
        for(int i = 0; i < num.length; i++)
            num[i] = scan.nextInt();
        
        System.out.println("The GCD is: "+GCD(num));
//        System.out.println("min: "+min(num));
    }
    
    public static int min(int[] num){
        int temp = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] < temp) temp = num[i];
        }
    return temp;
    }
    
    public static int GCD(int[] num){
        int gcd = 1, count = 0;
        
        for(int i = 2; i <= min(num); i++){//divisors
            count = 0;
            for(int j = 0; j < num.length; j++){//dividends                
                if(num[j] % i != 0)
                   count++;  
            }
                if(count == 0) gcd = i;
        }
        
        return gcd;
    }
}