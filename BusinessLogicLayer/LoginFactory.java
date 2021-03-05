package BusinessLogicLayer;

import java.io.IOException;
import java.util.*;

import DataAccessLayer.DAClientDetails;
import PresentationLayer.Clientview;

public class LoginFactory {
    Client client = new Client();
    DAClientDetails daclientdetails = new DAClientDetails();

    PlanEventFactory planning = new PlanEventFactory();
    Clientview cl = new Clientview();
    Scanner scner = new Scanner(System.in);  

    int eventChoice = 0;
   

    public Client GetEntry(int SignUp) throws IOException {

       
            switch (SignUp) {
                case 1:
                    daclientdetails.getClientDetails();
                    eventChoice = scner.nextInt();
                    cl.displayPlanMenu();

                    planning.PlanMenu(eventChoice);
                    
                    break;
                case 2:
                    System.out.println("-Weddings \n -Birthdays \n -Funerals \n -Other events you may want.");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        

        return client;

    }
    
}