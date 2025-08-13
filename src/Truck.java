import java.util.Scanner;
public class Truck {

    public String Name;
    private Local TruckContainer;
   // public CratesContainer cratesContainer;
    public Truck(String name, int crateCapacity)
    {
        Scanner input = new Scanner(System.in);

        Main.printLine("Comment se nomme votre camion ?");
        this.Name = input.nextLine();

        Main.printLine("Quelle est la capacité de votre Camion ?");
        this.TruckContainer = new Local(this.getName() + "Test" , input.nextInt());

    }

    public String getName()
    {
        return Name;
    }

    public void SetName(String name)
    {
        this.Name = name;
    }

    public void addCrates(Crate [] crates)
    {
        TruckContainer.addCrates(crates);
    }

    public Crate[] MoveCrates(int QuantityDesired)
    {
        return TruckContainer.MoveCrates(QuantityDesired);
    }

    public int GetTruckCapacity()
    {
        return TruckContainer.GetCapacity();
    }

}
