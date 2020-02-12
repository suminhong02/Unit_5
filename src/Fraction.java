/**
 * This class models a creation of fraction and mathematical operation such as subtraction, multiplication, addition, and division.
 * @author Sumin Hong
 * @since February 10, 2020
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * First constructor that makes a fraction with a given numerator and denominator by the user and simplifies the fraction.
     * @param numerator the numerator of fraction
     * @param denominator the denominator of fraction
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;

        if ((numerator>0 && denominator<0) || (numerator<0 && denominator<0)){
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
    }

    /**
     * Create a default constructor with numerator as 1 and denominator as 1.
     */
    public Fraction(){
        this(1,1);
    }

    /**
     * Find a greatest common multiple of numerator and denominator.
     * @param numerator numerator of a fraction
     * @param denominator denominator of a fraction
     * @return gcm of numerator and denominator.
     */
    public static int gcd(int numerator, int denominator){
        int m = numerator;
        int n = denominator;

        if(m%n == 0){
            return n;
        }

        while(m % n != 0){
            int oldm = m;
            int oldn = n;
            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     *Add two fractions together and reduce the form.
     * @param a first Fraction that is added
     * @param b second Fraction that is added
     * @return added Fraction in reduced form.
     */
    public static Fraction add(Fraction a, Fraction b){
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = (a.numerator * b.denominator) + (b.numerator * a.denominator);
        Fraction addedFraction = new Fraction(newNumerator, newDenominator);
        return addedFraction;
    }

    /**
     *Subtract two fractions and reduce the form.
     * @param a first Fraction that is subtracted
     * @param b second Fraction that is subtracted
     * @return subtracted fraction in reduced form.
     */
    public static Fraction subtract(Fraction a, Fraction b){
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = (a.numerator * b.denominator) - (b.numerator * a.denominator);
        Fraction subtractedFraction = new Fraction(newNumerator, newDenominator);
        return subtractedFraction;
    }

    /**
     *Multiply two fractions and reduce the form.
     * @param a first fraction that is multiplied
     * @param b second fraction that is multiplied
     * @return multiplied fraction in reduced form.
     */
    public static Fraction multiply(Fraction a, Fraction b){
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = a.numerator * b.numerator;
        Fraction multipliedFraction = new Fraction(newNumerator, newDenominator);
        return multipliedFraction;
    }

    /**
     *Divide two fractions and reduce the form.
     * @param a first fraction that is divided by the second fraction.
     * @param b second fraction that divides up the first fraction.
     * @return divided fraction in reduced form
     */
    public static Fraction divide(Fraction a, Fraction b){
        int newDenominator = a.denominator * b.numerator;
        int newNumerator = a.numerator * b.denominator;
        Fraction dividedFraction = new Fraction(newNumerator, newDenominator);
        return dividedFraction;
    }

    /**
     * Prints out the fraction with the fraction sign "/" and reduce its form.
     * @return fraction value numerator/denominator.
     */
    public String toString(){
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;

        if ((numerator>0 && denominator<0) || (numerator<0 && denominator<0)) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
        return numerator+ "/" + denominator;
    }
}
