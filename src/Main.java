import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 *
 */
public class Main {
     private int currentCratesLoading = 0;
     private int truckCrateEmplacement = 9;


     private int oldLocalCrates = 34;
     int newLocalCrates = 0;

    /**
     * Load good amount of crate in the truck , depending on wath remain in the old local
     */
    public  void loadCrates()
    {
        printLine("There is " + getOldPlaceCrateAmount() + " crates, in the old local");
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
        printLine("Loading " + getCurrentCratesLoading() + " in the truck. It remain " + oldLocalCrates + " crates, in the old local");

    }

    /**
     * Make the truck travelling from a place to another
     */
    public  void traveling()
    {
        System.out.println("Travelling");
    }

    /**
     * Unload the crate in the new local
     */
    public  void unloadCrates()
    {
        printLine("Unloading");
        newLocalCrates += getCurrentCratesLoading();
        printLine("Put " + getCurrentCratesLoading() + " crates, in the new local");
        setCurrentCratesLoading(0);
    }

    /**
     *
     * @param args
     * Basic paramater of java main function
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        printLine("Hello and welcome!");
        Main program = new Main();

        Scanner input = new Scanner(System.in);



        printLine("Combien de cartons voulez vous deplacer ?");
        program.setOldPlaceCrateAmount(input.nextInt());

        printLine("Quelle est la capacité de votre camion ?");
        program.setTruckCrateEmplacement(input.nextInt());

        while(program.oldLocalCrates > 0)
        {
            program.moving();
        }

        printLine("There is " +  program.newLocalCrates + " in the new local");

    }

    /**
     *
     * Usefull to not calling "System.out.println" everywhere in the code
     * @param messages
     * String type : The message to display on log
     */
    public static void printLine(String messages)
    {
        System.out.println(messages);
    }

    /**
     *
     * Polymorph of PrintLine(String message) to take "int" in parameters
     * @param messages
     *String Type : The message to print in the log
     *  */
    public static void printLine(int messages)
    {
        System.out.println(messages);
    }

    /**
     *
     * Call the instruction of moving
     */
    public void moving()
    {
            loadCrates();
            traveling();
            unloadCrates();
    }

    /**
     *
     * @return
     * Return the number of crate who are still in the old location
     */
    public int getOldPlaceCrateAmount() {
        return oldLocalCrates;
    }

    /**
     *
     * @param cratesNumber
     * Number of crate presente in the previous place
     */
    public void setOldPlaceCrateAmount(int cratesNumber) {
        this.oldLocalCrates = cratesNumber;
    }

    /**
     *
     * @return
     * Return the current number of crates in the truck
     */
    public int getCurrentCratesLoading() {
        return currentCratesLoading;
    }

    /**
     *
     * @param cratesLoading
     * Set the current number of crates in the truck
     */
    public void setCurrentCratesLoading(int cratesLoading) {
        this.currentCratesLoading = cratesLoading;
    }

    /**
     *
     * @param truckCrateEmplacement
     * Set the number max of emplacement for the truck
     */
    public void setTruckCrateEmplacement(int truckCrateEmplacement) {
        this.truckCrateEmplacement = truckCrateEmplacement;
    }

    /**
     *
     * @return
     * Return the number of crate emplacement free
     */
    public int getTruckCrateEmplacement() {
        return truckCrateEmplacement;
    }
}