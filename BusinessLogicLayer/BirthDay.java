package BusinessLogicLayer;
import java.util.*;

import PresentationLayer.ClientView;

public class BirthDay implements Event{
    
    boolean validDate = true;
    String eventType = "BirthDay";
    String eventDateandTime;
    String eventAddress;
    String eventTheme;
    int eventNumPeople;
    int bookingNum = 0;
    double price = 1500;

    
    //menu
    String starters;
    String mainCourse;
    String Desert;

	@Override
	public String[] getEventDetails() 
    {
        Scanner scn = new Scanner(System.in);
        String[] birthdayDeets = new String[9];

        System.out.println("When (Date)");
        eventDateandTime = scn.nextLine();

        System.out.println("Where (Address)");
        eventAddress = scn.nextLine();

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();
        if (eventNumPeople > 40) {
            price = price - (price * 0.15);
        }

        System.out.println("Do you have a theme?(Yes/No");
        eventTheme = scn.nextLine();

        System.out.println("==================================Menu:=============================");
        
        System.out.println("What starters would you like?");
        starters = scn.nextLine();

        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();

        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();
        
        scn.close();

        if (validDate == true) {
            birthdayDeets[0] = eventType;
            birthdayDeets[1] = eventDateandTime;
            birthdayDeets[2] = eventAddress;
            birthdayDeets[3] = String.valueOf(eventNumPeople);
            birthdayDeets[4] = starters;
            birthdayDeets[5] = mainCourse;
            birthdayDeets[6] = Desert;
            birthdayDeets[7] = String.valueOf(price);
            bookingNum = ClientView.eventIncrements;
            birthdayDeets[8] = String.valueOf(bookingNum);
        } else {
            System.out.println("An event has already been scheduled for that day");
        }
        return birthdayDeets;
       
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
