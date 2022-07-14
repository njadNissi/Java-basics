package Algo;

public class SumOfFactorialSequence {

    /**
     * Non-efficient algorithm. It calculates over and over same values.
     * 2!=2*1; 3!= 3*2*1; 4!=4*3*2*1 etc. every time from multiplying from N to 1;
     * */
    static long getSumOfFact(int N){
        long lastAns = 0;
        long sum = 0;

        for (int i = 1; i < N; i++)
            lastAns += factorial(i);

        return lastAns;
    }

    /**
     * Most-Efficient algorithm;
     * only the next number is multiplied to the previous product;
     * */
    static long getBestSumOfFact(int N){
        long lastAns = 0;
        long current = 1;

        for (int i = 1; i < N; i++){
            current *= i;
            lastAns += current;
        }
        return lastAns;
    }

    static long factorial(int N) {
        long ans = 1; /**case of 0 and 1 covered with this initialization*/
        for (int i = 1; i <= N; i++)
            ans *= i;
        return ans;
    }

    public static void main(String[] args) {
        int sum = 0;

        System.out.println(factorial(-5));
    }
}