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

    public int add(Rational n)
    {
        return ((numerator * (n.getDenominator())) + ((n.getNumertor()) * denominator))/((n.getDenominator()) * denominator);
    }

    public void setRational(int n, int d)
    {
        numerator = n;
        denominator = d;

    }

    
}
