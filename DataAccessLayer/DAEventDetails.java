package DataAccessLayer;
import java.io.*;

public class DAEventDetails {

    //Jandre DAEventDetails Update

    public void DAEventDetail(String[] stArr) throws IOException {

        
        File file = new File("EventDetails.txt");
        String path = file.getAbsolutePath();
        
        FileWriter fileWriter = new FileWriter(path,true);
        BufferedWriter bwriter = new BufferedWriter(fileWriter);


        if (stArr[0] == "Wedding") {

            String CombinedWedding = stArr[0] + "," + stArr[1] + "," + stArr[2] +"," + stArr[3] +", Menu: "+ stArr[4] +"," + stArr[5] +"," + stArr[6] +" \n";
            bwriter.write(CombinedWedding);

        } else if(stArr[0] == "BirthDay") {
            String combinedBirthday = stArr[0] + "," + stArr[1] + "," + stArr[2] +"," + stArr[3] +", Menu: "+ stArr[4] +"," + stArr[5] +"," + stArr[6] +" \n";
            bwriter.write(combinedBirthday);
            
        }else if (stArr[0] == "Funeral"){

        }else {
            String CombinedOtherEvent = stArr[0] + "," + stArr[1] + "," + stArr[2] +"," + stArr[3] +", Menu: "+ stArr[4] +"," + stArr[5] +"," + stArr[6] +" \n";
            bwriter.write(CombinedOtherEvent);


        }


        }

        bwriter.close();

       


        
    }
    
}
