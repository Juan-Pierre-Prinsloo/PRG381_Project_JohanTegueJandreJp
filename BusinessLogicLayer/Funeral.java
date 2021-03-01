package BusinessLogicLayer;
import java.util.*;



public class Funeral implements  Event{

    //Jandre Funeral class

    String eventType = "Funeral";
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    
    //menu
    String FuneralBouquet;
    

	@Override
	public String[] getEventDetails() {
		
        Scanner scn = new Scanner(System.in);
        String[] funeralDeets = new String[5];

        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();

        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();


        System.out.println("==================================Menu:=============================");
        System.out.println("What starters would you like?");
        FuneralBouquet = scn.nextLine();

        scn.close();

        return funeralDeets;
    }
}

