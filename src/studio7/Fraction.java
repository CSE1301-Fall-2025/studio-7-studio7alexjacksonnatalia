public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int initNum, int initDenom){
        numerator = initNum;
        denominator = initDenom;
    }

    public Fraction addFrac(Fraction fracTwo){
        int newNumerator = (numerator * fracTwo.denominator)+(fracTwo.numerator*denominator);
        int newDenominator = (denominator*fracTwo.denominator);
        Fraction newFrac = new Fraction(newNumerator, newDenominator);
        return newFrac;
    }

    public Fraction multFrac(Fraction fracTwo){
        int newNumerator = (numerator * fracTwo.numerator);
        int newDenominator = (denominator * fracTwo.denominator);
        Fraction newFrac = new Fraction(newNumerator, newDenominator);
        return newFrac;
    }

    public Fraction reciprocal(){
        return new Fraction(-denominator, numerator);
    }

    public Fraction simplify(){
        for (int i = numerator; i>0; i--){
            if (numerator % i == 0 && denominator % i==0){
                return new Fraction(numerator/i, denominator/i);
            }
        }
        return this;
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(4,6);
        System.out.println(f1.addFrac(f2).numerator + "/" + f1.addFrac(f2).denominator);
        System.out.println(f1.multFrac(f2).numerator + "/" + f1.multFrac(f2).denominator);
        System.out.println(f1.reciprocal().numerator + "/" + f1.reciprocal().denominator);
        System.out.println(f2.simplify().numerator + "/" + f2.simplify().denominator);
    }

}
