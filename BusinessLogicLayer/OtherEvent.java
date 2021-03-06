package BusinessLogicLayer;
import java.util.*;


//Jandre OtherEvent Code Update

public class OtherEvent implements Event {
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
        otherDeets[0] = eventType;


        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();
        otherDeets[1] = eventDateandTime;


        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();
        otherDeets[2] = eventAddress;


        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();
        if (eventNumPeople > 40) {
            price = price - (price * 0.15);
        }
        otherDeets[3] = String.valueOf(eventNumPeople);



        System.out.println("==================================Menu:=============================");
        System.out.println("What starters would you like?");
        starters = scn.nextLine();
        otherDeets[4] = starters;


        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();
        otherDeets[5] = mainCourse;


        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();
        otherDeets[6] = Desert;

        otherDeets[7] = String.valueOf(price);

        bookingNum = ClientView.eventIncrements;
        otherDeets[8] = String.valueOf(bookingNum);

        scn.close();

        return otherDeets;
    }
}
