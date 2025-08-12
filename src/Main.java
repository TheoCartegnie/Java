//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     int CurrentCratesLoading = 0;
     int TruckCrateEmplacement = 9;


     public int OldLocalCrates = 34;
     int NewLocalCrates = 0;


    public  void LoadCrates()
    {
        System.out.println("There is " + OldLocalCrates + " crates, in the old local");
        int testtruck = OldLocalCrates - TruckCrateEmplacement;
        System.out.println(testtruck);


        if(testtruck< 0) {
            CurrentCratesLoading = OldLocalCrates - testtruck;
            OldLocalCrates = 0;
        }
        else
        {
            OldLocalCrates -= 9;
            CurrentCratesLoading = 9;
        }
        System.out.println("Loading " + CurrentCratesLoading + " in the truck. It remain " + OldLocalCrates + " crates, in the old local");

    }

    public  void Traveling()
    {
        System.out.println("Travelling");
    }

    public  void UnloadCrates()
    {
        System.out.println("Unloading");
        NewLocalCrates += CurrentCratesLoading;
        System.out.println("Put " + CurrentCratesLoading + " crates, in the new local");
        CurrentCratesLoading = 0;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Main program = new Main();


        while(program.OldLocalCrates > 0)
        {
            program.Moving();
        }

        System.out.println("There is " +  program.NewLocalCrates + " in the new local");

    }


    public void Moving()
    {
            LoadCrates();
            Traveling();
            UnloadCrates();
    }
}