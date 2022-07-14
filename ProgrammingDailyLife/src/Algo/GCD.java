package Algo;

import java.util.Scanner;

    public class GCD {
        public static void main(String[] args) {
            int num1 = 0; //for example 5 questions
            int num2 = 0 ;
            
            Scanner scan  =  new Scanner(System.in);
            System.out.print("enter two numbers: ");
            num1 = scan.nextInt(); num2 = scan.nextInt();
            System.out.println("The GCD is: "+GCD(num1, num2));

            
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
    }
    public static int min(int num1, int num2){
        if(num1 > num2)
            return num2;
        else return num1;
    }
    
    public static int GCD(int num1, int num2){
        int gcd = 0;
        for(int i = 2; i <= min(num1, num2); i++){
            if((num1 % i == 0) && (num2 % i == 0)){
                gcd = i;
            }
        }
        
        return gcd;
    }
        
}

