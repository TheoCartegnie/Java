//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     int currentCratesLoading = 0;
     int truckCrateEmplacement = 9;


     public int oldLocalCrates = 34;
     int newLocalCrates = 0;


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

    public  void Traveling()
    {
        System.out.println("Travelling");
    }

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

    public static void PrintLine(String messages)
    {
        System.out.println(messages);
    }


    public static void PrintLine(int messages)
    {
        System.out.println(messages);
    }

    public void Moving()
    {
            LoadCrates();
            Traveling();
            UnloadCrates();
    }
}