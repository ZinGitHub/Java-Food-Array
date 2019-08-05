import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Scanner crewName = new Scanner(System.in);

        int captain_name_number = 1;

        ArrayList<String> arrayOfCrewName = new ArrayList<String>();
        //ArrayList<Integer> arrayOfCrewAmount = new ArrayList<Integer>();

        System.out.println("How many are in the crew (INCLUDING CAPTAIN): ");
        int numOfCrewMembers = Integer.parseInt(crewName.nextLine());

        String arrayOfNames[] = new String[numOfCrewMembers];

        if(arrayOfNames.length < 6)
        {
            for (int i = 0; i < 4; i++)
            {
                while(captain_name_number > 0)
                {
                    System.out.println("Enter captain name: ");
                    arrayOfCrewName.add(crewName.next());
                    captain_name_number--;
                }
                System.out.print("Enter your name crew member " + (i+1) + " : ");
                arrayOfCrewName.add(crewName.next());
                arrayOfNames[i] = crewName.nextLine();
            }

            System.out.print("Captain name: " + arrayOfCrewName.get(0) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(1) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(2) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(3) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(4) + "\n");
            System.out.println("Total crew size: " + arrayOfCrewName.size());
        }
        else
        {
            System.out.println("There should only be five crew members in total.");
            System.out.println("Please recount how many crew members there are, else stay on high-alert.");
        }




        //System.out.println("Please enter your name: ");
        //arrayOfCrewName.add(crewName.next());
        //System.out.println("Please enter your number: ");
        //arrayOfCrewAmount.add(crewName.nextInt());
    }
}