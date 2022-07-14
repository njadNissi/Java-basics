package Algo;

import java.util.Arrays;

public class ProbabilityTest {

    static double experience1(double N, double numOfTests){
        double count = 0;
        for (int i = 0; i < numOfTests; i++) {
            if(Math.random() < N)
                count++;
        }
        return (count / numOfTests);
    }

    /**Inclusive Min and Exclusive Max*/
    static int[] experience2(int min, int max, double numOfTests){
        int[] results = new int[max + 1];

        for (int i = 0; i < numOfTests; i++) {
            int x = (int) (Math.random() * (max - min) + min);
            results[x]++;
        }

        return results;
    }
    /**Exclusive Min and Inclusive Max*/
    static int[] experience3(int min, int max, double numOfTests){
        int[] results = new int[max + 1];

        for (int i = 0; i < numOfTests; i++) {
            int x = (int) (Math.random() * (max - min) + min) + 1;
            results[x]++;
        }

        return results;
    }


    public static void main(String[] args) {

        double testTimes = 1000000;
        double testValue = 0.6;

        /** E X P E R I E N C E  I */
        //System.out.println(experience1(testValue, testTimes));

        /** E X P E R I E N C E  II */
        int[] results = experience3(6, 35, testTimes);
        double sum = 0.0;
        for(int i = 0; i < results.length; i++) {
            System.out.println("[" + i + "] -> {" + results[i] + '}');
            sum += results[i];
        }
        System.out.println("\n Total = " + (sum / testTimes));
    }

}
