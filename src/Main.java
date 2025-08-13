import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 *
 */
public class Main {


    Truck truck = new Truck("SuperTruck",9);
    Local Oldlocal = new Local("OldLocal",36);
    Local Newlocal = new Local("NewLocal",36);

    Crate[] crates = new Crate[10];

    public void InitMoving(String truckName, int truckCapactity)
    {
        truck = new Truck(truckName,truckCapactity);
    }

    public void FillTruck()
    {
        Oldlocal.fillCrates();

        while(Oldlocal.GetCrateAmount() > 0) {
            truck.addCrates(Oldlocal.MoveCrates(truck.GetTruckCapacity()));
            Newlocal.addCrates(truck.MoveCrates(truck.GetTruckCapacity()));
        }
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

        printLine("Combien de cartons voulez vous transporter ?");
       int Capacity = input.nextInt();

       program.Oldlocal = new Local("Old local",Capacity);
       program.Newlocal = new Local("New local",Capacity);

        program.FillTruck();


//
//        while(program.oldLocalCrates > 0)
//        {
//            program.moving();
//        }
//
//        printLine("There is " +  program.newLocalCrates + " in the new local");

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

}