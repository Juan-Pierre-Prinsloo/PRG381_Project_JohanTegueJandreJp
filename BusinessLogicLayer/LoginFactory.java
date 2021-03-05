package BusinessLogicLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import DataAccessLayer.DAClientDetails;
//import PresentationLayer.Clientview;
import PresentationLayer.ClientView;

public class LoginFactory {
    Client client = new Client();
    DAClientDetails daclientdetails = new DAClientDetails();

    PlanEventFactory planning = new PlanEventFactory();
    ClientView cl = new ClientView();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
    string str = br.readLine(); //for string input

    int i = Integer.parseInt(br.readLine()); // for Integer Input*/     

    int eventChoice =  0; 
   

    public Client GetEntry(int SignUp) throws IOException {

       
            switch (SignUp) {
                case 1:

                    daclientdetails.getClientDetails();
                    eventChoice = Integer.parseInt(br.readLine());
                    ClientView.displayPlanMenu();

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