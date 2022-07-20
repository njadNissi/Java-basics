package Algo.complex;

public class IncorrectComplexNumberException extends Exception {

    @Override
    public String toString(){
        return "NJAD NISSI framework. specifications and requirements\n"
                .concat("IncorrectComplexNumberException:")
                .concat("   This method requires both parts: real and imaginary.\n")
                .concat("   the miss of one of them will lead to a failure of building a complex number object.\n")
                .concat("   To build a complex number with a null real part, please use fromImaginaryNumber(double) method.\n")
                .concat("   To build a complex number with a null imaginary part, please use fromRealNumber(double) method.\n")
                .concat("Check the below stacktrace:");
    }

}