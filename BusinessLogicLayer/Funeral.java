package BusinessLogicLayer;
import java.util.*;

import PresentationLayer.ClientView;

public class Funeral implements  Event{

    boolean validDate = true;
    String eventType = "Funeral";
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    int bookingNum = 0;
    double price = 7000;
    
    String FuneralBouquet;
    
	@Override
	public String[] getEventDetails() {
		
        Scanner scn = new Scanner(System.in);
        String[] funeralDeets = new String[7];

        System.out.println("When (Date)");
        eventDateandTime = scn.nextLine();

        System.out.println("Where (Address)");
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

        validateDate();

        if (validDate == true) {
            funeralDeets[0] = eventType;
            funeralDeets[1] = eventDateandTime;
            funeralDeets[2] = eventAddress;
            funeralDeets[3] = String.valueOf(eventNumPeople);
            funeralDeets[4] = FuneralBouquet;
            funeralDeets[5] = String.valueOf(price);
            bookingNum = ClientView.eventIncrements;
            funeralDeets[6] = String.valueOf(bookingNum);
        } else {
            System.out.println("An event has already been scheduled for that day");
        }

        return funeralDeets;
    }

    @Override
    public void validateDate(){
        Scanner sc  = new Scanner(new File("EventDetails.txt"));

        while(sc.hasNext()){
            String[] line = sc.nextLine().split(",");
            String[] date = line[1].split(":");
            if (eventDateandTime == date[1]) {
                validDate = false;
            }
        }
    }
}

