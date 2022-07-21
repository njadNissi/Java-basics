package Algo.complex;

public class Main {

    public static void main(String[] args) throws IncorrectComplexNumberException {


        Complex z1 = Complex.fromRealNumber(-5);
        Complex z2 = Complex.fromImaginaryNumber(10);
        Complex z3 = Complex.subtract(z1, z2);
        System.out.println(z1 + " - " + z2 + " = " + z3);

        Complex[] complexes = new Complex[7]; //41+j2
        complexes[0] = Complex.fromExpression(" 4 1+j2");
        complexes[1] = Complex.fromExpression("+41 +j2");
        complexes[2] = Complex.fromExpression("41- j 2");
        complexes[3] = Complex.fromExpression("-41-j2 ");
        complexes[4] = Complex.fromExpression("-4+j2");
        complexes[5] = Complex.fromExpression("41+j");
        complexes[6] = Complex.fromExpression("j-41");

        for (Complex c : complexes)
            System.out.println(c);

        System.out.println("(-4+j2) * (j+4) = " + Complex.multiply(complexes[4], complexes[6]));
    }
}