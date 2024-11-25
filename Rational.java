public class Rational
{
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumertor()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public boolean isBigger(Rational n)
    {
        if((numerator/denominator) > (n.getNumertor())/(n.getDenominator()))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void add(Rational n)
    {
        int a = ((numerator * (n.getDenominator())) + ((n.getNumertor()) * denominator));
        int b = ((n.getDenominator()) * denominator);

        numerator = a;
        denominator = b;
    }

    public void setRational(int s, int d)
    {
        numerator = s;
        denominator = d;
    }

}
