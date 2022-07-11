package Algo;

import java.util.Scanner;

public class Array_3D {
    /*
    Suppose the scores are stored in a threedimensional array named scores. 
     The first index in scores refers to   student, the second refers to an exam, and the third refers to a part of the exam.
     Suppose there are seven students, five exams, and each exam has two parts: a multiplechoice part and a programming part.
     The program calculates the total score for the students in a class.
    */
    
    public static void main(String[] args) {
        int scores[][][] = new int[2][2][2];//6 students, 5 exams, each exam 2parts
        
        System.out.println("3D-Array implementation\n==============================\n");
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < scores[0].length; i++){
            System.out.println("enter student "+(i+1)+" ");
            for(int j = 0; j < scores[0][0].length; j++){
                System.out.println("enter exam n"+(j+1)+": ");
                System.out.println("exam: part1 ==> Single choice\n part2 ==> Multiple choice\n------------------------------------------");
                for(int k = 0; k < 2; k++){
                    System.out.println("enter exam "+(j+1)+" part "+(k+1)); 
                    System.out.print("    SCORE"+(k+1)+": ");
                    scores[i][j][k] = scan.nextInt();
                }
                System.out.println("\n========================================");
            }
                System.out.println("\n========================================");
        }
                for(int i = 0; i < scores[0].length; i++){
                    System.out.println("enter student "+(i+1)+" ");
                    for(int j = 0; j < scores[0][0].length; j++){
                        System.out.println("enter exam n"+(j+1)+": ");
                        for(int k = 0; k < 2; k++){
                            System.out.print("    SCORE"+(k+1)+": ");
                            System.out.print(scores[i][j][k]+"    ");
                    }
                    System.out.println("");
                }
                }
//            for(int[][] row: scores)
//                for(int[][] col: scores)
//                    for(int[][] cell: scores)
//                    System.out.println(cell);
    }
}
