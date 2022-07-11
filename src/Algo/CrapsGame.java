package Algo;

import java.util.Scanner;

public class CrapsGame {
    
    static int rollDie(){
        int face = (int) (Math.random() *6) + 1;
        return face;
    }
    static int rollDice(){
        int die1 = rollDie();
        int die2 = rollDie();
        return die1 + die2;
    }
    static String checkWin(int die1, int die2){
        String result = "";
        switch(Math.addExact(die1, die2)){
            case 2:
            case 3: 
            case 12: result = "Craps, you lost!"; break;
            case 7:
            case 11: result = "Natural, you won!"; break;
            default: result = "null";
        }
        return result;
    }
    
    public static void main(String[] args) {
        int die1 = 0, die2 = 0, k = 1;
        char play = 'T';
        Scanner scan = new Scanner(System.in);
        
        while(play == 'T' || play == 't'){
            System.out.println("CRAPS GAME: "+k);
            die1 = rollDie(); 
            die2 = rollDie();
             while(checkWin(die1, die2) == "null"){
                die1 = rollDie(); 
                die2 = rollDie();
            }
            System.out.println("die1 die2");
            System.out.println(die1+"   +   "+die2+" = "+(die1+die2));
            System.out.println("case: "+checkWin(die1, die2));        
            System.out.print("continue? T/N: "); play = scan.next().charAt(0);
                    k++;
            break;
        } 
    }
}