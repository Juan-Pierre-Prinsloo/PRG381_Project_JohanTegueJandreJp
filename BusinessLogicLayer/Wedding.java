package BusinessLogicLayer;
import java.util.*;

import jdk.javadoc.internal.tool.Main;

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
		
        //Jandre Wedding change

        Scanner scn = new Scanner(System.in);
        String[] weddingDeets = new String[7];
        weddingDeets[0]= eventType;

        weddingDeets[0] = eventType;

        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();
        weddingDeets[1] = eventDateandTime;

        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();
        weddingDeets[2] = eventAddress;


        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();
        weddingDeets[3] = String.valueOf(eventNumPeople).toString();



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





        scn.close();

        return weddingDeets;

		
	}

    
}
