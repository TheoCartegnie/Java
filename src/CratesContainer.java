public class CratesContainer {

    Crate[] capacity = new Crate[0];
    public CratesContainer cratesContainer;

    public CratesContainer(int cratesAmount) {
        capacity = new Crate[cratesAmount];
    }

    public void initCrate()
    {
        for(int i=0;i<capacity.length;i++)
        {
            capacity[i] = new Crate("Crate "+(i+1));
        }
    }


    public Crate GetCrate(int id)
    {
         if(id < capacity.length && capacity[id] != null)
         {
             return capacity[id];
         }
         return null;
    }

    public void AddCrateSpecificID(int id, Crate crate)
    {
        if(id <= capacity.length-1 && capacity[id] == null) {
            capacity[id] = crate;
        }
        else
        {
            Main.printLine("Crates cas is not empty, or crate container is full");
        }
    }

    public void AddOneCrate(Crate crate)
    {
        int id = GetLastCrateID()+1;
        if(id <= capacity.length-1) {
            capacity[id] = crate;
        }
        //Main.printLine("Crate " + id + " has been added");
    }

    public void RemoveOneCrate(int id)
    {
        capacity[id] = null;
    }

    public int GetLastCrateID()
    {
        for(int i=capacity.length-1; i >= 0;i--)
        {
            if(capacity[i] != null) {
                return i;
            }
        }
        return 0;
    }

    public int GetCrateNumber()
    {
        int crateAmount = 0;
        for(int i = 0; i < capacity.length; i++)
        {
            if(capacity[i] != null)
            {
                crateAmount++;
            }
        }

        return crateAmount;
    }

    public void AddCrates(Crate [] crates)
    {
        Main.printLine("The last crate emplacement was : "  + GetLastCrateID() );
        for(int i = 0; i < crates.length; i++)
        {
            AddOneCrate(crates[i]);
        }
    }

    public int GetContainerSize()
    {
        return capacity.length;
    }
}
