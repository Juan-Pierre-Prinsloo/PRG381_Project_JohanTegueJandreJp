package BusinessLogicLayer;
import java.util.*;

public class Wedding implements Event{
    String eventType = "Wedding";
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    
    //menu
    String starters;
    String mainCourse;
    String Desert;



	@Override
	public String[] getEventDetails() {
		
        Scanner scn = new Scanner(System.in);
        String[] weddingDeets = new String[7];

        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();

        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();


        System.out.println("==================================Menu:=============================");
        System.out.println("What starters would you like?");
        starters = scn.nextLine();

        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();

        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();

        scn.close();

        return weddingDeets;

		
	}

    
}
