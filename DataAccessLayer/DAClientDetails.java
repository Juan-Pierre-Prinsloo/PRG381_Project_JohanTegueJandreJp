package DataAccessLayer;

import java.io.*;
import java.util.*;
import BusinessLogicLayer.*;

public class DAClientDetails {
    
    public List<Client> getClientDetails() throws IOException {

       
        String[] clientDetails = new String[3];
        List<Client> clientList = new ArrayList<Client>();
        //Client client;

        String name = "";
        String surname = "";
        String cellNumber = "";

        File file = new File("ClientDetails.txt");
        String path = file.getAbsolutePath();

        Scanner scn = new Scanner(System.in);

        FileWriter fileWriter = new FileWriter(path,true);
        BufferedWriter bwriter = new BufferedWriter(fileWriter);

        System.out.println("Enter name:");

        clientDetails[0] = scn.nextLine();
        name = clientDetails[0];

        System.out.println("Enter surname:");

        clientDetails[1] = scn.nextLine();
        surname = clientDetails[1];

        System.out.println("Enter cell number:");
        
        clientDetails[2] = scn.nextLine();
        cellNumber = clientDetails[2];

        String Combined = name + "," + surname + "," + cellNumber + " \n";

        clientList.add(new Client(clientDetails[0],clientDetails[1],clientDetails[2]));

        bwriter.write(Combined);
        
        bwriter.close();
        scn.close();
     

        return clientList;
    }

   
}
