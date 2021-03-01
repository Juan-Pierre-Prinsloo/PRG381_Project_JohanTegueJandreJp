package BusinessLogicLayer;
import java.util.*;

public class BirthDay implements Event{
    
    String eventType = "BirthDay";
    String eventDateandTime;
    String eventAddress;
    String eventTheme;
    int eventNumPeople;
    
    //menu
    String starters;
    String mainCourse;
    String Desert;

	@Override
	public String[] getEventDetails() 
    {
		
        Scanner scn = new Scanner(System.in);
        String[] birthdayDeets = new String[7];

        

        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();
        birthdayDeets[0] = eventDateandTime;

        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();
        birthdayDeets[1] = eventAddress;

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();
        birthdayDeets[2] = String.valueOf(eventNumPeople);

        System.out.println("Do you have a theme?(Yes/No");
        eventTheme = scn.nextLine();
        birthdayDeets[3] = eventTheme;


        System.out.println("==================================Menu:=============================");
        
        System.out.println("What starters would you like?");
        starters = scn.nextLine();
        birthdayDeets[4] = starters;

        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();
        birthdayDeets[5] = mainCourse;

        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();
        birthdayDeets[6] = Desert;

        scn.close();

        return birthdayDeets;
       
    }
}
