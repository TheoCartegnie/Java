import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     private int currentCratesLoading = 0;
     private int truckCrateEmplacement = 9;


     public int oldLocalCrates = 34;
     int newLocalCrates = 0;

    /**
     * Load good amount of crate in the truck , depending on wath remain in the old local
     */
    public  void LoadCrates()
    {
        PrintLine("There is " + getOldPlaceCrateAmount() + " crates, in the old local");
        int testTruck = getOldPlaceCrateAmount() - getTruckCrateEmplacement();
   
        if(testTruck < 0) {
            setCurrentCratesLoading(getOldPlaceCrateAmount());
            setOldPlaceCrateAmount(0);
        }
        else
        {
            setOldPlaceCrateAmount(getOldPlaceCrateAmount() - 9);
            setCurrentCratesLoading(getTruckCrateEmplacement());
        }
        PrintLine("Loading " + getCurrentCratesLoading() + " in the truck. It remain " + oldLocalCrates + " crates, in the old local");

    }

    /**
     * Make the truck travelling from a place to another
     */
    public  void Traveling()
    {
        System.out.println("Travelling");
    }

    /**
     * Unload the crate in the new local
     */
    public  void UnloadCrates()
    {
        PrintLine("Unloading");
        newLocalCrates += getCurrentCratesLoading();
        PrintLine("Put " + getCurrentCratesLoading() + " crates, in the new local");
        setCurrentCratesLoading(0);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PrintLine("Hello and welcome!");
        Main program = new Main();

        Scanner input = new Scanner(System.in);



        PrintLine("Combien de cartons voulez vous deplacer ?");
        program.setOldPlaceCrateAmount(input.nextInt());

        PrintLine("Quelle est la capacité de votre camion ?");
        program.setTruckCrateEmplacement(input.nextInt());

        while(program.oldLocalCrates > 0)
        {
            program.Moving();
        }

        PrintLine("There is " +  program.newLocalCrates + " in the new local");

    }

    /**
     *
     * Usefull to not calling "System.out.println" everywhere in the code
     */
    public static void PrintLine(String messages)
    {
        System.out.println(messages);
    }

    /**
     *
     * Polymorph of PrintLine(String message) to take "int" in parameters
     */
    public static void PrintLine(int messages)
    {
        System.out.println(messages);
    }

    /**
     *
     * Call the instruction of moving
     */
    public void Moving()
    {
            LoadCrates();
            Traveling();
            UnloadCrates();
    }

    public int getOldPlaceCrateAmount() {
        return oldLocalCrates;
    }

    public void setOldPlaceCrateAmount(int cratesNumber) {
        this.oldLocalCrates = cratesNumber;
    }

    public int getCurrentCratesLoading() {
        return currentCratesLoading;
    }

    public void setCurrentCratesLoading(int cratesLoading) {
        this.currentCratesLoading = cratesLoading;
    }

    public void setTruckCrateEmplacement(int truckCrateEmplacement) {
        this.truckCrateEmplacement = truckCrateEmplacement;
    }

    public int getTruckCrateEmplacement() {
        return truckCrateEmplacement;
    }
}