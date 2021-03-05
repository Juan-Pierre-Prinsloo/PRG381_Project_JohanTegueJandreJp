package BusinessLogicLayer;

import java.io.IOException;
import java.util.*;

import DataAccessLayer.DAEventDetails;

public class PlanEventFactory {
    Event event;
    DAEventDetails devent = new DAEventDetails();
    

    public Event PlanMenu(int eventChoice) throws IOException {
        /*Scanner scn = new Scanner(System.in);
        int choice = 0;
        choice = scn.nextInt();*/
        


        switch (eventChoice) {
            case 1://wedding
                event = new Wedding();
                devent.DAEventDetail(event.getEventDetails());
                break;
        
            case 2://bifday
                event = new BirthDay();
                devent.DAEventDetail(event.getEventDetails());
                break;
        
            case 3://funeral
                event = new Funeral();
                devent.DAEventDetail(event.getEventDetails());
                break;
        
            case 4://other
                event = new OtherEvent();
                devent.DAEventDetail(event.getEventDetails());
                break;
        
            default:
                break;
        }
        return event;
    }
}
