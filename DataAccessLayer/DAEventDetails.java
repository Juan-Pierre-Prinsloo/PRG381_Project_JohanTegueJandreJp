package DataAccessLayer;

import java.io.File;

public class DAEventDetails {

    public void DAEventDetail(String[] stArr){

        

        File file = new File("ClientDetails.txt");
        String path = file.getAbsolutePath();
        
        FileWriter fileWriter = new FileWriter(path,true);
        BufferedWriter bwriter = new BufferedWriter(fileWriter);


        
    }
    
}
