package BusinessLogicLayer;
import java.util.*;

public class Wedding implements Event{
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

        weddingDeets[0] = eventType;

        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();
        weddingDeets[1] = eventDateandTime;

        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();
        weddingDeets[2] = eventAddress;

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();
        if (eventNumPeople > 40) {
            price = price - (price * 0.15);
        }
        weddingDeets[3] = String.valueOf(eventNumPeople);


        System.out.println("==================================Menu:=============================");
        System.out.println("What starters would you like?");
        starters = scn.nextLine();
        weddingDeets[4] = starters;

        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();
        weddingDeets[5] = mainCourse;

        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();
        weddingDeets[6] = Desert;

        weddingDeets[7] = String.valueOf(price);

        

        scn.close();

        return weddingDeets;

		
	}

    
}
