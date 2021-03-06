package DataAccessLayer;
import java.io.*;

public class DAEventDetails {

    public void DAEventDetail(String[] stArr) throws IOException {
        
        File file = new File("EventDetails.txt");
        String path = file.getAbsolutePath();
        
        FileWriter fileWriter = new FileWriter(path,true);
        BufferedWriter bwriter = new BufferedWriter(fileWriter);

        if (stArr[0] == "Wedding") {

            String CombinedWedding = "Event Type: " + stArr[0] + ", Date:" + stArr[1] + ", Address: " + stArr[2] + ", Amount of People:" + stArr[3] +", Menu: Starters:"+ stArr[4] +", Main Course: " + stArr[5] +", Desert: " + stArr[6] + ", Price: " +  stArr[7] + ", Booking Number: " + stArr[8] + " \n";
            bwriter.write(CombinedWedding);

        } else if(stArr[0] == "BirthDay") {

            String combinedBirthday = "Event Type: " + stArr[0] + ", Date:" + stArr[1] + ", Address: " + stArr[2] + ", Amount of People:" + stArr[3] +", Menu: Starters:"+ stArr[4] + ", Main Course: " + stArr[5] + ", Desert: " + stArr[6] + ", Price: " +  stArr[7] + ", Booking Number: " + stArr[8] +" \n";
            bwriter.write(combinedBirthday);
            
        }else if (stArr[0] == "Funeral"){

            String CombinedFuneral = "Event Type: " + stArr[0] + ", Date:" + stArr[1] + ", Address: " + stArr[2] + ", Amount of People:" + stArr[3] +", FuneralBouquet: " + stArr[4] + ", Price: " +  stArr[5] + ", Booking Number: " + stArr[6] +" \n";
            bwriter.write(CombinedFuneral);
            
        }else {

            String CombinedOtherEvent = "Event Type: " + stArr[0] + ", Date:" + stArr[1] +", Address: " + stArr[2] + ", Amount of People:" + stArr[3] + ", Menu: Starters:" + stArr[4] + ", Main Course: " + stArr[5] + ", Desert: " + stArr[6] + ", Price: " +  stArr[7] + ", Booking Number: " + stArr[8] +" \n";
            bwriter.write(CombinedOtherEvent);

        }

        bwriter.close();
        
    }
    
}
