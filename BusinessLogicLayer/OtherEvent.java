package BusinessLogicLayer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import PresentationLayer.ClientView;

public class OtherEvent implements Event {
    boolean validDate = true;
    String eventType;
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    int bookingNum = 0;
    double price = 5000;
    
    //menu
    String starters;
    String mainCourse;
    String Desert;

	@Override
	public String[] getEventDetails() {
		
        Scanner scn = new Scanner(System.in);
        String[] otherDeets = new String[9];
        System.out.println("What type of event is it?");
        eventType = scn.nextLine();

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
            otherDeets[0] = eventType;
            otherDeets[1] = eventDateandTime;
            otherDeets[2] = eventAddress;
            otherDeets[3] = String.valueOf(eventNumPeople);
            otherDeets[4] = starters;
            otherDeets[5] = mainCourse;
            otherDeets[6] = Desert;
            otherDeets[7] = String.valueOf(price);
            bookingNum = ClientView.eventIncrements;
            otherDeets[8] = String.valueOf(bookingNum);
        } else {
            System.out.println("An event has already been scheduled for that day");
        }

        return otherDeets;
    }

    @Override
    public void validateDate() throws FileNotFoundException{
        Scanner sc  = new Scanner(new File("EventDetails.txt"));

        while(sc.hasNext()){
            String[] line = sc.nextLine().split(",");
            if (eventDateandTime == line[1]) {
                validDate = false;
            }
        }
    }
}
