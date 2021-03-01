package BusinessLogicLayer;

import java.io.IOException;

import DataAccessLayer.DAClientDetails;

public class LoginFactory {
    Client client = new Client();
    DAClientDetails daclientdetails = new DAClientDetails();
   

    public Client GetEntry(int SignUp) throws IOException {

       
            switch (SignUp) {
                case 1:
                    daclientdetails.getClientDetails();
                    break;
                case 2:
                    System.out.println("-Weddings \n -Birthdays \n -Funerals \n -Other events you may want.");
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        

        return client;

    }
    
}