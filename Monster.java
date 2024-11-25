public class Monster
{
    private String name;
    private double size;

    public Monster(String name, double size)
    {
        this.name = name;
        this.size = size;
    }

    public String getName()
    {
        return name;
    }

    public double getSize()
    {
        return size;
    }

    public boolean isBigger(Monster n)
    {
        if(n.getSize() < size)
        {
            return true;
        }
        else{
            return false;
        }

    }

    public boolean namesTheSame(Monster n)
    {
        if(name.equals(n.getName()))
        {
            return true;
        }
        else{
            return false;
        }
       
    }

    public boolean isSmaller(Monster n)
    {
        if(n.getSize() > size)
        {
            return true;
        }
        else{
            return false;
        }

    }
}
