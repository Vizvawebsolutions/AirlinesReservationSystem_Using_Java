// Declare the package and import required classes
package Classes;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Define the Reservation class
public class Reservation {
    
    // Declare private class members
    private int reservationNumber;
    private int numberOfPassengers;
    private Passenger[] passengers;
    private String flightNumber;
    private String departureDate;
    private Seat[] reservedSeats;

    // Define a default constructor
    public Reservation(){}

    // Define a parameterized constructor
    public Reservation(int reservationNumber, int numberOfPassengers, Passenger[] passengers, String flightNumber, String departureDate, Seat[] reservedSeats) {
        this.reservationNumber = reservationNumber;
        this.numberOfPassengers = numberOfPassengers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.reservedSeats = reservedSeats;
    }

    // Define setter methods for the class members
    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureDate(int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");     //Defines the date format needed
        Calendar calendar1 = new GregorianCalendar(year, month-1, day);   //creates a date from Calendar class   
        this.departureDate = sdf.format(calendar1.getTime());
    }   

    public void setReservedSeats(Seat[] reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    // Define getter methods for the class members
    public int getReservationNumber() {
        return reservationNumber;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void getPassengers() {
        // Display the list of passengers
        for(int i=0; i<passengers.length; i++){
            System.out.println(passengers[i]);
        }   
    }

    public Passenger[] getPassengersArray() {
        // Return the array of passengers
        return passengers;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }
    
    public String[] getReservedSeats(){
        // Get the list of reserved seat IDs
        String[] reservedSeatID = new String[this.getNumberOfPassengers()];  
        for(int i=0; i<reservedSeatID.length; i++){
            reservedSeatID[i] = reservedSeats[i].getSeatID();
        }
        return reservedSeatID;
    } 

    // Override the toString() method to display the object's state as a string
    @Override
    public String toString() {
        String array1 = Arrays.toString(passengers);
        String array2 = Arrays.toString(getReservedSeats());
        return reservationNumber + "*" + numberOfPassengers + "*" + array1 + "*" + flightNumber + "*" + departureDate + "*" + array2 ;
    }  
}
