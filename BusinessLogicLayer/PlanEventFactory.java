package BusinessLogicLayer;

public class PlanEventFactory {
    Event event;

    public Event PlanMenu(int choice){

        switch (choice) {
            case 1://wedding
                event = new Wedding();
                break;
        
            case 2://bifday
                event = new BirthDay();
                break;
        
            case 3://funeral
                event = new Funeral();
                break;
        
            case 4://other
                event = new OtherEvent();
                break;
        
            default:
                break;
        }
        return event;
    }
}
