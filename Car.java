public class Car
{
    private int drivenDist;
    private int changeIdt;

    public Car(int drivenDist, int changeIdt)
    {
        this.drivenDist = drivenDist;
        this.changeIdt = changeIdt;
    }

    public boolean timeForOilChange()
    {
        if(drivenDist >= changeIdt)
        {
            drivenDist = 0;
            return true;
        }
        else{
            return false;
        }
    }

    public int addMiles(int m)
    {
        drivenDist = drivenDist + m;
        return drivenDist;
    }

    
}
