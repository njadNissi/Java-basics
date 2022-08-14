package Algo.parallel_programming;


public class ReciprocalArraySum {
    private static double sum1;
    private static double sum2;

    public static void main(String[] args) {

    }

    public static double computeSumSequentially(double[] X){
        long startTime = System.nanoTime();
        sum1 = 0;
        sum2 = 0;

        //compute sum for the upper half of the array
        for (int i = 0; i < X.length / 2; i++) {
            sum1 += 1 / X[i];
        }

        //compute sum for the lower half of the array
        for (int i = X.length / 2; i < X.length; i++) {
            sum2 += 1 / X[i];
        }

        double sum = sum1 + sum2;
        long endTime = System.nanoTime();
        printResult("SequentialSum", endTime, sum);
        return sum;
    }

    public static double computeSumParallely(double[] X) {
        long startTime = System.nanoTime();
        sum1 = 0;
        sum2 = 0;

        //compute sum for the upper half of the array
       /* async(() -> {
        for (int i = 0; i < X.length / 2; i++) {
            sum1 += 1 / X[i];
        }});*/

        //compute sum for the lower half of the array
        for (int i = X.length / 2; i < X.length; i++) {
            sum2 += 1 / X[i];
        }

        double sum = sum1 + sum2;
        long endTime = System.nanoTime();
        printResult("SequentialSum", endTime, sum);
        return sum;
    }

    private static void printResult(String name, long timeInNanos, double sum){
        System.out.printf(" %s completed in %8.3f milliseconds, with sum = %8.5f \n", name, timeInNanos / 1e6, sum);
    }
}