package Classes;

public class Seat {
    private String seatID;    //rowNumber+columnCharacter
    private boolean status;   //shows whether a seat is booked or not; true if reserved
    
    //constructor
    public Seat(String seatID, boolean status) {
        this.seatID = seatID;
        this.status = status;
    }

    //setter method for seatID
    public void setSeatID(String seatID) {
        //checks if the seatID is valid, containing only alphanumeric characters and having a length of 3
        if(seatID.matches("[a-zA-Z0-9]+$") && seatID.length()==3){
            this.seatID = seatID.toUpperCase();
        }
        else{
            System.out.println("Invalid Airline ID");
        }
    }

    //setter method for status
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //getter method for seatID
    public String getSeatID() {       
        return seatID;
    }

    //getter method for status
    public boolean isStatus() {
        return status;
    }
    
    //override toString method to return a string representation of the object
    @Override
    public String toString() {
        return this.getSeatID() + "\t" + this.isStatus();
    } 
}
