package Algo;

import java.util.Random;
import java.util.Scanner;

public class ArithmeticGame {
    
    public static void main(String[] args) {

        int choice = 1, score = 0;
        float rightAnswer = 0, yourAnswer = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while(choice == 1){
            int num1 = random.nextInt(-500,500);
            int num2 = random.nextInt(-500,500);
            int op = random.nextInt(4);
            
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
                } else if((op == 2 || op == 3) && Math.abs(yourAnswer - rightAnswer) < 1){
                    System.out.println("not bad! answer = " + rightAnswer);
                    score += 4;
                }
                else {
                    System.out.println("Wrong! right answer = " + rightAnswer);
                    score -= 2.5;
                }
            
            System.out.println("actual score: " + score);
            
            System.out.print("continue?:|Yes :1|-|No :0| ");
            choice = scanner.nextInt();
        }
        
    }
}
