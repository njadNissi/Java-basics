package Algo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    
    public static void main(String[] args) {
        int choice = 1, result = 0, answer = 0, score = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while(choice == 1){
            int num1 = rand.nextInt(500);
            int num2 = rand.nextInt(500);
            int op = rand.nextInt(4);
            
            System.out.println("      Find\n-----------------------");  
                switch(op){
                    case 0: System.out.print(num1+" + "+num2+" = "); result = num1 + num2; break;
                    case 1: System.out.print(num1+" - "+num2+" = "); result = num1 - num2; break;
                    case 2: System.out.print(num1+" * "+num2+" = "); result = num1 * num2; break;
                    case 3: System.out.print(num1+" / "+num2+" = "); result = num1 / num2; break;                        
                }
                answer = scanner.nextInt();
                if(answer == result) {
                    System.out.println("Correct!");
                    score += 1;
                }
                else System.out.println("Wrong!");
            
            System.out.println("actual score: "+score);
            
            System.out.print("continue?:|Yes :1|-|No :0| ");
            choice = scanner.nextInt();
        }
        
    }
}
