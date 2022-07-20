package Algo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersGame {
    
    public static void main(String[] args) {

        int choice = 1, score = 0;
        float rightAnswer = 0, yourAnswer = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while(choice == 1){

            float num1 = rand.nextFloat(500);
            float num2 = rand.nextFloat(500);
            int op = rand.nextInt(4);
            
            System.out.println("      Find\n-----------------------");  
                switch(op){
                    case 0: System.out.print(num1+" + "+num2+" = "); rightAnswer = num1 + num2; break;
                    case 1: System.out.print(num1+" - "+num2+" = "); rightAnswer = num1 - num2; break;
                    case 2: System.out.print(num1+" * "+num2+" = "); rightAnswer = num1 * num2; break;
                    case 3: System.out.print(num1+" / "+num2+" = "); rightAnswer = num1 / num2; break;
                }
                yourAnswer = scanner.nextFloat();
                if(yourAnswer == rightAnswer) {
                    System.out.println("Correct!");
                    score += 5;
                }
                else System.out.println("Wrong!");
            
            System.out.println("actual score: " + score);
            
            System.out.print("continue?:|Yes :1|-|No :0| ");
            choice = scanner.nextInt();
        }
        
    }
}
