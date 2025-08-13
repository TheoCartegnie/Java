public class Local {
    private String name;
    public CratesContainer cratesContainer;

    public Local(String name, int crateAmount) {
        cratesContainer = new CratesContainer(crateAmount);
        this.name = name;
    }


    public void fillCrates()
    {
        cratesContainer.initCrate();
    }

    public Crate MoveOneCrate()
    {
        int id = cratesContainer.GetLastCrateID();

        Crate crate = cratesContainer.GetCrate(id);
        cratesContainer.RemoveOneCrate(id);

        return crate;
    }

    public void AddOneCrate(Crate crate)
    {
        cratesContainer.AddOneCrate(crate);
    }

    public void addOneCrates(Crate [] crates)
    {
        cratesContainer.AddCrates(crates);
    }

    public int GetCrateAmount()
    {
        return cratesContainer.GetCrateNumber();
    }

    public void removeAllCrates()
    {

    }

    public void addCrates(Crate [] crates)
    {
        cratesContainer.AddCrates(crates);
        Main.printLine("There is now : " + cratesContainer.GetCrateNumber() + " in " + name);
    }

    public Crate[] GetCrates()
    {
        return cratesContainer.capacity ;
    }

    public int GetCapacity()
    {
        return cratesContainer.GetContainerSize();
    }

    public Crate[] MoveCrates(int CreateDesired)
    {
        Crate[] crates = new Crate[CreateDesired];
        for(int i = 0; i < CreateDesired; i++)
        {
           crates[i] = MoveOneCrate();
        }
        Main.printLine("There is now : " + cratesContainer.GetCrateNumber() + " in " + name);
        return crates;
    }

}
