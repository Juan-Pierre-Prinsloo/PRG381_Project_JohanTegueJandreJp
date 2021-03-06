package BusinessLogicLayer;
public class Client {

    private String name;
    private String surname;
    private String cellNumber;

    public Client(){

    }

    public Client(String name, String surname, String cellNumber){
        this.name = name;
        this.surname = surname;
        this.cellNumber = cellNumber;

    }

    public String getName(String nm) {
        return name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
