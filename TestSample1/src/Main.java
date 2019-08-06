import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // Obtain user input on crew names.
        Scanner crewName = new Scanner(System.in);

        // Int variable that will restrict the amount of captains to one only.
        int captain_name_number = 1;

        //An ArrayList for crew names.
        ArrayList<String> arrayOfCrewName = new ArrayList<String>();
        //ArrayList<Integer> arrayOfCrewAmount = new ArrayList<Integer>();

        // 2D array for the amount of food boxes.
        // 5 = crew size.
        // 12 = weeks in Mars exploration.
        int foodBoxes[][] = new int[5][12];


        for (int i = 0; i < foodBoxes.length; i++)
        {
            for (int j = 0; j < foodBoxes[i].length; j++)
            {
                foodBoxes[i][j] = 4;
            }
        }

        // Ask user for crew size.
        System.out.println("How many are in the crew (INCLUDING CAPTAIN): ");
        int numOfCrewMembers = Integer.parseInt(crewName.nextLine());

        // String array of crew member names in correlation to number of crew members.
        String arrayOfNames[] = new String[numOfCrewMembers];

        // If statement to have reassurance that the crew size can only be less than five.
        if(arrayOfNames.length < 6)
        {
            // For loop to ask for crew member names four times.
            for (int i = 0; i < 4; i++)
            {
                // While loop for the reassurance that the user can only input one captain name.
                while(captain_name_number > 0)
                {
                    // Ask user for captain name.
                    System.out.println("Enter captain name: ");
                    arrayOfCrewName.add(crewName.next());
                    captain_name_number--;
                }
                // Ask user for crew member names.
                System.out.print("Enter your name crew member " + (i+1) + " : ");
                arrayOfCrewName.add(crewName.next());
                arrayOfNames[i] = crewName.nextLine();
            }

            // Display captain name and crew members.
            System.out.print("Captain name: " + arrayOfCrewName.get(0) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(1) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(2) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(3) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(4) + "\n");
            // Display the size of the crew.
            System.out.println("\nTotal crew size: " + arrayOfCrewName.size());

            for (int i = 0; i < numOfCrewMembers; i++)
            {
                foodBoxes[i][0] -= 2;

                System.out.println(arrayOfCrewName.get(i) + ":");

                for (int j = 0; j < foodBoxes[i].length; j++)
                {
                    System.out.println("\tWeek " + (j+1) + " Food: " + foodBoxes[i][j]);
                }

                System.out.println();
            }
        }
        else // Else statement for user states that there are more than 5 crew members in total.
        {
            // Warning notification.
            System.out.println("There should only be five crew members in total.");
            System.out.println("Please recount how many crew members there are, else stay on high-alert.");
        }

        /*
              0    1   2   3    ...
            0
            1
            2
            ...
         */
        String doubleArray[][] = new String[5][5];

        doubleArray[0][0] = "Hello";
        doubleArray[0][1] = "there";

        System.out.println(doubleArray[0][0] + " " + doubleArray[0][1]);

        //System.out.println("Please enter your name: ");
        //arrayOfCrewName.add(crewName.next());
        //System.out.println("Please enter your number: ");
        //arrayOfCrewAmount.add(crewName.nextInt());
    }
}