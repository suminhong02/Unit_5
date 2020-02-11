/**
 * This class models a creation of fraction and mathematical operation such as subtraction, multiplication, addition, and division.
 * @author Sumin Hong
 * @since February 10, 2020
 */
public class Fraction {
    private int numerator;
    private int denominator;
    /**
     * First constructor
     * @param numerator the numerator of fraction
     * @param denominator the denominator of fraction
     */

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        if (numerator>0 && denominator<0){
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
    }

    public Fraction(){
        this.numerator = 0;
        this.denominator = 0;
    }
}
