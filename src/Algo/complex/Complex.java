package Algo.complex;

public class Complex {

    private double realNum;
    private double imaginaryNum;
    private static final char IMAGINARY_SYMBOL = 'j';

    private Complex(double real, double imaginary) {
        this.realNum = real;
        this.imaginaryNum = imaginary;
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
     * */
    public static Complex fromExpression(String expression) throws IncorrectComplexNumberException {
        expression = removeSpaces(expression);
        int indexOfImaginarySymbol = expression.indexOf(IMAGINARY_SYMBOL);
        int lastDigit = expression.length() - 1; //in substring last index is exclusive
        int indexOfPlusOperator = expression.lastIndexOf('+');
        int indexOfMinusOperator = expression.lastIndexOf('-');
        int indexOfOperator;
        double realNum = 0, imagNum = 0;

        /**if last index of plus is > 0 then the operator between the two parts is plus
         * otherwise is minus*/
        if (indexOfPlusOperator > 0)
            indexOfOperator = indexOfPlusOperator;
        else
            indexOfOperator = indexOfMinusOperator;

        try {
            /**With the known index of the operator, check the order of the two ports give
             * the index of i*/
            if (indexOfImaginarySymbol == 0 || indexOfImaginarySymbol == 1) {
                /**  index == 0 -> positive imaginary, index == 1 -> negative imaginary
                 * case of imaginaryPart operator realPart*/
                if (indexOfImaginarySymbol + 1 == indexOfOperator)
                    imagNum = 1;
                else
                    imagNum = Double.parseDouble(expression.substring(indexOfImaginarySymbol + 1, indexOfOperator));
                realNum = Double.parseDouble(expression.substring(indexOfOperator + 1, lastDigit + 1));
            } else {
                /**  index > 1 -> case of realPart operator imaginaryPart
                 * if s*/
                realNum = Double.parseDouble(expression.substring(0, indexOfOperator));
                if (indexOfImaginarySymbol == lastDigit)//case of 4 + 5j
                    imagNum = 1;
                else
                    imagNum = Double.parseDouble(expression.substring(indexOfImaginarySymbol + 1, lastDigit + 1));
            }
            if (expression.charAt(indexOfOperator) == '-')
                imagNum *= -1;
        } catch (Exception e){
            if(expression.isEmpty()
            || (!expression.contains("+") && !expression.contains("-")))
                throw new IncorrectComplexNumberException();
        }

        return new Complex(realNum, imagNum);
    }

    public static Complex add(Complex c1, Complex c2){
        return new Complex(c1.realNum + c2.realNum, c1.imaginaryNum + c2.imaginaryNum);
    }

    public static Complex subtract(Complex c1, Complex c2){
        return new Complex(c1.realNum - c2.realNum, c1.imaginaryNum - c2.imaginaryNum);
    }

    public static Complex multiply(Complex c1, Complex c2){
        return new Complex(c1.realNum * c2.realNum - (c1.imaginaryNum * c2.imaginaryNum),
                c1.realNum * c2.imaginaryNum + c2.realNum * c1.imaginaryNum);
    }

    private static String removeSpaces(String expression){
        String cleanExpression = "";
        for (char c : expression.toCharArray())
            if (c != ' ')
                cleanExpression += c;
        return cleanExpression;
    }

    public String toString() {
        String complexNumber = "";
        try{
            if (this.realNum >= 1 && this.imaginaryNum == 1)
                complexNumber = this.realNum + " + " + IMAGINARY_SYMBOL;
            else if (this.realNum >= 1 && this.imaginaryNum >= 2)
                complexNumber = this.realNum + " + "+ "" + IMAGINARY_SYMBOL + this.imaginaryNum;
            else if (this.realNum >= 1 && this.imaginaryNum <= -1)
                complexNumber = this.realNum + " - " + IMAGINARY_SYMBOL + Math.abs(this.imaginaryNum);
            else if (this.realNum >= 1 && this.imaginaryNum== 0)
                complexNumber += this.realNum;
            else if (this.realNum == 0 && this.imaginaryNum >= 2)
                complexNumber = IMAGINARY_SYMBOL + "" + this.imaginaryNum;
            else if (this.realNum < 0 && this.imaginaryNum < -1)
                complexNumber = this.realNum + " - " + IMAGINARY_SYMBOL + "" + Math.abs(this.imaginaryNum);
            else if (this.realNum < 0 && this.imaginaryNum >= 2)
                complexNumber = this.realNum + " + " + IMAGINARY_SYMBOL + "" + Math.abs(this.imaginaryNum);
        } catch (Exception e){

        }

        return complexNumber;
    }

}