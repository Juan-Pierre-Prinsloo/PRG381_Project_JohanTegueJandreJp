package PresentationLayer;

import java.io.*;
import java.util.Scanner;

import BusinessLogicLayer.LoginFactory;
import BusinessLogicLayer.PlanEventFactory;

public class ClientView{

    public static int eventIncrements = 0;

    public static void main(String[] args) throws IOException {

        LoginFactory factory = new LoginFactory();
        PlanEventFactory planning = new PlanEventFactory();
        //boolean flag = true;

        //Scanner scner = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        
 
        int eventChoice = 0;
        int choice = 0;


        while (true) {
            
            /*displaySignInMenu();
            choice = extracted(scner);
            factory.GetEntry(choice);
            displayPlanMenu();
            eventChoice = extracted(scner);
            planning.PlanMenu(eventChoice);if (choice == 1) {
              
            }*/

            InputStreamReader sr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(sr);
            
            displaySignInMenu();
            choice = scn.nextInt();

            if (choice != 1) 
            {
                eventIncrements++;
                factory.GetEntry(choice);

                displayPlanMenu();
                eventChoice = scn.nextInt();

                planning.PlanMenu(eventChoice);
            } 
             else 
             {
                factory.GetEntry(choice);
                
            }
            //scn.close();

        }
    }

    public static void displayPlanMenu(){
        System.out.println("=========Event Planning================");
        System.out.println("Choose the type of event:");
        System.out.println("1.Wedding \n2.Birthday \n3.Funeral \n4.Other");
    }
    public static void displaySignInMenu(){
        System.out.println("====================Welcome to Rachael's Event planning===================== \n");
    
            System.out.println("Dou you want to Sign Up?");
            System.out.println("Press: \n 1. Sign Up \n 2. List of Events we offer. \n 3. Exit" );
    }

   
}
