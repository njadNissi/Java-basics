package Algo.complex;

public class IncorrectComplexNumberException extends Exception {

    @Override
    public String toString(){
        return "NJAD NISSI framework. specifications and requirements\n" +
                "IncorrectComplexNumberException:" +
                "   This method requires both parts: real and imaginary.\n" +
                "   the miss of one of them will lead to a failure of building a complex number object.\n" +
                "   To build a complex number with a null real part, please use fromImaginaryNumber(double) method.\n" +
                "   To build a complex number with a null imaginary part, please use fromRealNumber(double) method.\n" +
                "Check the below stacktrace:";
    }

}