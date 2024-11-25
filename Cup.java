import java.util.Arrays;

public class Cup
{
    private double limCup;
    private double amtCup = 0;
    private int howManyAdd = 0;

    public Cup(int limCup)
    {
        this.limCup = limCup;
    }

    public double getAmtInCup()
    {
        return amtCup;
    }

    public double add(int a)
    {
        amtCup = a + amtCup;
        howManyAdd++;
        return amtCup;
    }

    public boolean isFull()
    {
        if(amtCup >= limCup)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean willOverflow(int n)
    {
        if(amtCup + n >= limCup)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumAdds()
    {
        return howManyAdd;
    }

    public double pour(int lost)
    {
        amtCup = amtCup - lost;
        return amtCup;
    }

    public double addLots(double[] i)
    {
        amtCup =  (Arrays.stream(i).sum()) + amtCup;
        return amtCup;
    }

}
