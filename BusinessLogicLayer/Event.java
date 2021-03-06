package BusinessLogicLayer;

import java.io.FileNotFoundException;

// import java.io.FileNotFoundException;
// import java.util.*;

public interface Event {
    
    String[] getEventDetails() throws FileNotFoundException;

    void validateDate() throws FileNotFoundException;

}