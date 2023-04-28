package Classes;  // declares that this class belongs to the "Classes" package

import java.io.*;  // imports necessary input/output classes
import java.util.Scanner;  // imports a class for reading user input

public class Airline {  // defines a new class called "Airline"
    private String airlineID;   // declares a private String variable called "airlineID" that will store the airline's two-lettered ID
    private String airlineName;    // declares a private String variable called "airlineName" that will store the airline's name
    
    //constructor 01
    public Airline() {  // defines a constructor with no arguments
        this.airlineID = "";  // sets the airlineID to an empty string
        this.airlineName = "";  // sets the airlineName to an empty string
    }
    
    //constructor 02
    public Airline(String airlineID, String name) {  // defines a constructor that takes two arguments: airlineID and name
        this.setAirlineID(airlineID);  // sets the airlineID using the setAirlineID method
        this.setAirlineName(name);  // sets the airlineName using the setAirlineName method
    }
    
    public void setAirlineID(String airlineID) {  // defines a method that sets the airlineID
        
        if(airlineID.matches("[a-zA-Z]+$") && airlineID.length()==2){  // checks if airlineID matches the regular expression "[a-zA-Z]+$" (only contains letters) and if it has a length of 2
            this.airlineID = airlineID.toUpperCase();  // if it does, sets airlineID to the uppercase version of the input
        }
        else{
            System.out.println("Invalid Airline ID");  // if not, prints an error message
        }
        
    }

    public void setAirlineName(String airlineName) {  // defines a method that sets the airlineName
     
        if (airlineName.matches("[a-zA-Z ]+$")) {  // checks if airlineName matches the regular expression "[a-zA-Z ]+$" (only contains letters and spaces)
            this.airlineName = airlineName;  // if it does, sets airlineName to the input
        }
        else{
            System.out.println("Invalid Airline Name");  // if not, prints an error message
        }
        
    }

    public String getAirlineID() {  // defines a method that returns the airlineID
        return airlineID;  // returns the airlineID in uppercase
    }

    public String getAirlineName() {  // defines a method that returns the airlineName
        return airlineName;  // returns the airlineName
    }
    
    @Override
    public String toString() {  // overrides the toString method to return a string representation of the Airline object
        return this.getAirlineID() + "," + this.getAirlineName();  // returns a string in the format "airlineID,airlineName"
    }
}
