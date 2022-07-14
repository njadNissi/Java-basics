package Algo;

import java.util.ArrayList;

class Sequence {

    public static enum Type{
        ARITH, GEOM
    }
    private final Type type;
    private final ArrayList<Double> terms;
    private Double firstTerm;
    private int numOfterms;
    private Double sum, prod;
    private double reason;

    public Sequence(Type type){

        this.type = type;
        this.terms = new ArrayList<Double>();

    }

    public void generateSequence(double firstTerm, int numOfTerms, double reason){

        /**reinitialize attributes*/
        this.firstTerm = firstTerm;
        this.numOfterms = numOfTerms;
        this.sum = 0.0;
        this.prod = 1.0;
        this.reason = reason;

        switch(this.type){
            case ARITH-> {
                    for(int i = 0; i < numOfTerms; i++){
                        double term = firstTerm + i * reason;
                        this.terms.add(term);
                        this.sum += term;
                        this.prod *= term;
                    }
            }
            case GEOM -> {
                    for(int i = 0; i < numOfTerms; i++){
                        double term = firstTerm * Math.pow(reason, i);
                        this.terms.add(term);
                        this.sum += term;
                        this.prod *= term;
                    }
            }
        }

    }

    public String getType(){
        return this.type.toString();
    }

    public double getSum(){
        return this.sum;
    }

    public double getProd(){
        return this.prod;
    }
    @Override
    public String toString(){
        return this.terms.toString();
    }

    public double getTerm(int n){
        if(n <= terms.size())
            return this.terms.get(n-1);
        else
            return Double.POSITIVE_INFINITY;
    }

    public int getTermsNo(){
        return this.terms.size();
    }

    public Double getFirstTerm(){
        return this.terms.get(0);
    }

    public Double getLastTerm(){
        return this.terms.get(this.terms.size() - 1);
    }
}

public class Series {

    public static void main(String[] args){

        Sequence s1 = new Sequence(Sequence.Type.ARITH);
        s1.generateSequence(1, 10, 2);
        System.out.println(s1.getType() + s1);
        System.out.println("sum = "+ + s1.getSum() + "; product = " + s1.getProd());

        Sequence s2 = new Sequence(Sequence.Type.GEOM);
        s2.generateSequence(20, 5, 0.5);
        System.out.println(s2.getType() + s2);
        System.out.println("sum = "+ + s2.getSum() + "; product = " + s2.getProd());
        System.out.println("3rd term = " + s2.getTerm(3));

    }

}
