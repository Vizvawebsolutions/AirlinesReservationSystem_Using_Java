package TestClasses;   //This code belongs to the TestClasses package
import Classes.Airline;  //Importing the Airline and Flight classes from the Classes package
import Classes.Flight;

public class FlightTest {  //This is the FlightTest class

/**
 * This is the main method that runs the test cases
 */
public static void main(String[] args) {
  
    //Test constructor 01
    //Creating an instance of Flight class using the default constructor
    Flight flight1 = new Flight();
    //System.out.println(flight1);
    
    //Creating an instance of Airline class
    Airline airline1 = new Airline("mH", "Malasia Airlines");
    
    //Test setters
    //Setting the flight number using the Airline ID and flight number
    flight1.setFlightNumber(airline1.getAirlineID(), " 5564");
    //Setting the departure date using day, month, and year
    flight1.setDepartureDate(27,11,2016);
    //Setting the departure airport
    flight1.setDepartureAirport("cmb");
    //Setting the destination airport
    flight1.setDestinationAirport("ccu");
    //Setting the departure time using hours and minutes
    flight1.setDepartureTime(16, 35);
    //Setting the arrival time using hours and minutes
    flight1.setArrivalTime(19, 48);
    
    //Printing the flight details using the toString method
    System.out.println(flight1);
    
    
    //Test constructor 02
    //Creating an instance of Flight class using the parameterized constructor
    Flight flight2 = new Flight("UL 1123", 16, 11, 2016, "cmb", "ccu", "12:45", "14:42");
    //Printing the flight details using the toString method
    System.out.println(flight2);
    
   //test getters
    //Printing the flight number
    System.out.println(flight2.getFlightNumber());
    //Printing the departure date
    System.out.println(flight2.getDepartureDate());
    //Printing the departure airport
    System.out.println(flight2.getDepartureAirport());
    //Printing the destination airport
    System.out.println(flight2.getDestinationAirport());
    //Printing the departure time
    System.out.println(flight2.getDepartureTime());
    //Printing the arrival time
    System.out.println(flight2.getArrivalTime());
    
}    
    
}
