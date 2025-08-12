//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     int currentCratesLoading = 0;
     int truckCrateEmplacement = 9;


     public int oldLocalCrates = 34;
     int newLocalCrates = 0;

    /**
     * Load good amount of crate in the truck , depending of wath remain in the old local
     */
    public  void LoadCrates()
    {
        PrintLine("There is " + oldLocalCrates + " crates, in the old local");
        int testTruck = oldLocalCrates - truckCrateEmplacement;
        PrintLine(testTruck);


        if(testTruck < 0) {
            currentCratesLoading =  oldLocalCrates;
            oldLocalCrates = 0;
        }
        else
        {
            oldLocalCrates -= 9;
            currentCratesLoading = 9;
        }
        PrintLine("Loading " + currentCratesLoading + " in the truck. It remain " + oldLocalCrates + " crates, in the old local");

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
        newLocalCrates += currentCratesLoading;
        PrintLine("Put " + currentCratesLoading + " crates, in the new local");
        currentCratesLoading = 0;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PrintLine("Hello and welcome!");
        Main program = new Main();


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
}