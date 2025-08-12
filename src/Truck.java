public class Truck {

    public String Name;
    public int CrateCapacity;
    public Crate[] Crates = new Crate[10];

    public Truck(String name, int crateCapacity)
    {
        this.Name = name;
        this.CrateCapacity = crateCapacity;
    }

    public String getName()
    {
        return Name;
    }

    public void SetName(String name)
    {
        this.Name = name;
    }

    public int getCrateCapacity()
    {
        return CrateCapacity;
    }

    public void  setCrateCapacity(int crateCapacity)
    {
        this.CrateCapacity = crateCapacity;
    }
}
