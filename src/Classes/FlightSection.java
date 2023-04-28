// package declaration
package Classes;

// class definition
public class FlightSection {

    // instance variable of SeatClass type
    private SeatClass seatClass;
    
    // constructor 01 - no-arg constructor
    public FlightSection() {
        // initializes seatClass to null
        this.seatClass = null;
    }  
    
    // constructor 02 - parameterized constructor
    public FlightSection(SeatClass seatClass) {
        // initializes seatClass to the parameter value
        this.seatClass = seatClass;
    }

    // setter method for seatClass
    public void setSeatClass(SeatClass seatClass) {
        // sets the value of seatClass
        this.seatClass = seatClass;
    }

    // getter method for seatClass
    public SeatClass getSeatClass() {
        // returns the value of seatClass
        return seatClass;
    }

    // A commented-out method that seems to set the seat class based on a seat ID
    // public void setSeatClass(String seatID) { ... }

    // overridden toString method that returns a string representation of the FlightSection object
    @Override
    public String toString() {
        return "Seat Class: " + seatClass ;
    }
}
