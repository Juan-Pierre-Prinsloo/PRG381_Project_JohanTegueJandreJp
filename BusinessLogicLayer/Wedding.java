package BusinessLogicLayer;
import java.util.*;

import PresentationLayer.ClientView;

public class Wedding implements Event{
    boolean validDate = true;
    String eventType = "Wedding";
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    int bookingNum = 0;
    double price = 70000;
    
    //menu
    String starters;
    String mainCourse;
    String Desert;

	@Override
	public String[] getEventDetails() {
        Scanner scn = new Scanner(System.in);
        String[] weddingDeets = new String[9];

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
        starters = scn.nextLine();

        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();

        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();

        bookingNum = ClientView.eventIncrements;

        scn.close();

        if (validDate == true) {
            weddingDeets[0] = eventType;
            weddingDeets[1] = eventDateandTime;
            weddingDeets[2] = eventAddress;
            weddingDeets[3] = String.valueOf(eventNumPeople);
            weddingDeets[4] = starters;
            weddingDeets[5] = mainCourse;
            weddingDeets[6] = Desert;
            weddingDeets[7] = String.valueOf(price);
            bookingNum = ClientView.eventIncrements;
            weddingDeets[8] = String.valueOf(bookingNum);
        } else {
            System.out.println("An event has already been scheduled for that day");
        }

        return weddingDeets;
	}

    @Override
    public void validateDate(){
        Scanner sc  = new Scanner(new File("EventDetails.txt"));

        while(sc.hasNext()){
            String[] line = sc.nextLine().split(",");
            if (eventDateandTime == line[1]) {
                validDate = false;
            }
        }
    }

    
}
