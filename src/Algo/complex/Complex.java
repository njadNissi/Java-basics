package Algo.complex;

public class Complex {

    private double realPart;
    private double imaginaryPart;
    private static char IMAGINARY_NUMBER = 'j';

    private Complex(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    public static Complex fromRealNumber(double realNumber) {
        return new Complex(realNumber, 0.0);
    }

    public static Complex fromImaginaryNumber(double imaginaryNumber) {
        return new Complex(0.0, imaginaryNumber);
    }

    /**
     * This method requires both parts: real and imaginary.
     * the miss of one of them will lead to a classical interpretation error
     * and consequently to a null object.
     * For a null real number case, please use fromImaginaryNumber() method.
     * For a null imaginary number case, please use fromRealNumber() method.
     */
    public static Complex fromExpression(String exp) throws IncorrectComplexNumberException {
        exp = removeSpaces(exp);
        double realNum = 0, imaginaryNum = 0;
        try {
            if (firstImaginaryPartThenRealPart(exp)) {
                if (exp.indexOf(IMAGINARY_NUMBER) + 1 == getIndexOfOperator(exp)) {
                    imaginaryNum = 1;
                } else
                    imaginaryNum = Double.parseDouble(exp.substring(exp.indexOf(IMAGINARY_NUMBER) + 1, getIndexOfOperator(exp)));
                realNum = Double.parseDouble(exp.substring(getIndexOfOperator(exp) + 1));
            } else {/**index > 1 -> case of realPart operator imaginaryPart*/
                realNum = Double.parseDouble(exp.substring(0, getIndexOfOperator(exp)));
                if (exp.indexOf(IMAGINARY_NUMBER) == exp.length() - 1)//case of 4 + 5j
                    imaginaryNum = 1;
                else
                    imaginaryNum = Double.parseDouble(exp.substring(exp.indexOf(IMAGINARY_NUMBER) + 1));
            }
            if (exp.charAt(getIndexOfOperator(exp)) == '-') imaginaryNum *= -1;
        } catch (Exception e) {
            if (exp.isEmpty() || (!exp.contains("+") && !exp.contains("-")))
                throw new IncorrectComplexNumberException();
        }
        return new Complex(realNum, imaginaryNum);
    }

    public static void customizeImaginaryNumber(char symbol) {
        if (symbol >= 'a' && symbol <= 'z')
            Complex.IMAGINARY_NUMBER = symbol;
    }

    public static int getPowerOfImaginaryNumber(int power) {
        return (power % 2 == 0 ? 1 : -1);
    }

    public void setReal(double realNumber) {
        this.realPart = realNumber;
    }

    public double getReal() {
        return this.realPart;
    }

    public void setImaginary(double imaginaryNum) {
        this.realPart = imaginaryNum;
    }

    public double getImaginary() {
        return this.imaginaryPart;
    }

    public static Complex add(Complex... numbers) {
        Complex sumOfComplexes = new Complex(0, 0);
        for (Complex c : numbers) {
            sumOfComplexes.realPart += c.realPart;
            sumOfComplexes.imaginaryPart += c.imaginaryPart;
        }
        return sumOfComplexes;
    }

    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.realPart - c2.realPart, c1.imaginaryPart - c2.imaginaryPart);
    }

    public static Complex multiply(Complex c1, Complex c2) {
        return new Complex(c1.realPart * c2.realPart - (c1.imaginaryPart * c2.imaginaryPart),
                c1.realPart * c2.imaginaryPart + c2.realPart * c1.imaginaryPart);
    }

    private static boolean firstImaginaryPartThenRealPart(String expression) {
        /**  index == 0 -> positive imaginary, index == 1 -> negative imaginary
         * case of imaginaryPart operator realPart.
         * example => j4 or -j4
         * */
        return (expression.indexOf(IMAGINARY_NUMBER) == 0 || expression.indexOf(IMAGINARY_NUMBER) == 1);
    }

    private static String removeSpaces(String expression) {
        String cleanExpression = "";
        for (char c : expression.toCharArray())
            if (c != ' ')
                cleanExpression += c;
        return cleanExpression;
    }

    private static int getIndexOfOperator(String expression) {
        /**if last index of plus is > 0 then the operator between the two parts is plus
         * otherwise is minus*/
        if (expression.lastIndexOf('+') > 0)
            return expression.lastIndexOf('+');
        else
            return expression.lastIndexOf('-');
    }

    public String toString() {
        try {
            if (this.realPart < 0) {
                if (this.imaginaryPart < -1)
                    return this.realPart + " - " + IMAGINARY_NUMBER + "" + Math.abs(this.imaginaryPart);
                if(this.imaginaryPart == 0)
                    return this.realPart + "";
                if (this.imaginaryPart >= 2)
                    return this.realPart + " + " + IMAGINARY_NUMBER + "" + Math.abs(this.imaginaryPart);
            }
            if (this.realPart == 0 && this.imaginaryPart >= 2)
                return IMAGINARY_NUMBER + "" + this.imaginaryPart;
            if (this.realPart >= 1) {
                if (this.imaginaryPart == 1)
                    return this.realPart + " + " + IMAGINARY_NUMBER;
                if (this.imaginaryPart == 0)
                    return String.valueOf(this.realPart);
                if (this.imaginaryPart >= 2)
                    return this.realPart + " + " + "" + IMAGINARY_NUMBER + this.imaginaryPart;
                if (this.imaginaryPart <= -1)
                    return this.realPart + " - " + IMAGINARY_NUMBER + Math.abs(this.imaginaryPart);
            }
        } catch (Exception e) {
        }
        return null; /**If both parts are zeros*/
    }

}