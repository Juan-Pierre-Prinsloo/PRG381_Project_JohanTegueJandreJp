package PresentationLayer;

import java.io.IOException;
import java.util.*;

import BusinessLogicLayer.LoginFactory;

public class ClientView {
    public static void main(String[] args) throws IOException {

        LoginFactory factory = new LoginFactory();
        boolean flag = true;

        while (flag == true) {
            System.out.println("====================Welcome to Rachael's Event planning===================== \n");
            Scanner scner = new Scanner(System.in);
    
            System.out.println("Dou you want to Sign Up?");
    
            System.out.println("Press: \n 1. Sign Up \n 2. List of Events we offer. \n 3. Exit" );
    
            int choice = scner.nextInt();
            
            if (choice == 1) {
                flag = false;
            }
    
            factory.GetEntry(choice);
    
            scner.close();
        }
        
      

        
    }
}
