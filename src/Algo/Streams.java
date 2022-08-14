package Algo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streams {

    static void printWithProbableNull(List<Integer> list, int x){
        System.out.println(list.stream()
                .filter(e -> e > x)
                .findFirst());
                /*.orElse(0));*/ //add this to return this as default case
    }
    static void printIntegersWithIterate(){
        IntStream.iterate(0, i -> i <= 9, i -> i+2)
                .forEach(System.out::println);
    }

    static void printIntegersWithinRange(int start, int end){
        /**print numbers within range*/
        IntStream
                .range(start, end) //rangeClosed(start, end) -> closed interval
                .forEach(System.out::println);
    }
    static void printWithFiltering(List<Integer> list){
        /**print only even numbers*/
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    static void printElementsBeforeConditionNoMet(List<Integer> list){
        /**print numbers before meet one that doesn't meet the requirement.
         * ===> limit method*/
        list.stream().
                takeWhile(i -> i > 0).forEach(System.out::println);
    }

    static void printElementsAfterConditionNotMet(List<Integer> list){
        /**print numbers after meet one that doesn't meet the requirement.
         * ===> skip method*/
        list.stream()
                .dropWhile(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    static void printFirstNElements(List<Integer> list, int n){
        /**print numbers until meet one that doesn't meet the requirement.*/
        list.stream()
                .limit(n)
                .forEach(System.out::println);
    }

    static void printAfterFirstNElements(List<Integer> list, int n){
        /**print numbers until meet one that doesn't meet the requirement.*/
        list.stream()
                .skip(n)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {

        printWithProbableNull(Arrays.asList(1, -11, 50, 47, 36, 73), 100);
    }

}
