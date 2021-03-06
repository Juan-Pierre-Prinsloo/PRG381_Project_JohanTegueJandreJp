package BusinessLogicLayer;
import java.util.*;



public class Funeral implements  Event{

    String eventType = "Funeral";
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    int bookingNum;
    double price = 7000;
    
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
        if (eventNumPeople > 40) {
            price = price - (price * 0.15);
        }


        System.out.println("==================================Menu:=============================");
        System.out.println("What starters would you like?");
        FuneralBouquet = scn.nextLine();

        scn.close();

        funeralDeets[0] = eventType;
        funeralDeets[1] = eventDateandTime;
        funeralDeets[2] = eventAddress;
        funeralDeets[3] = String.valueOf(eventNumPeople);
        funeralDeets[4] = FuneralBouquet;

        return funeralDeets;
    }
}

