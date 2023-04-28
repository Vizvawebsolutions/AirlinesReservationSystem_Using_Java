// defining the package name
package TestClasses;
import Classes.Airport; // importing the Airport class from the Classes package

public class AirportTest { // defining the AirportTest class

// defining the main method
public static void main(String[] args) {
    
    // creating an instance of the Airport class using the default constructor and printing it
    Airport airport1 = new Airport();
    System.out.println(airport1);
    
    // setting the properties of the airport1 object using setter methods and printing it again
    airport1.setAirportID("cmb");
    airport1.setCity("Colombo");
    airport1.setCountry("Sri Lanka");
    System.out.println(airport1);
    
    // creating an instance of the Airport class using the parameterized constructor and printing it
    Airport airport2 = new Airport("ccu", "Kolkata", "India");
    System.out.println("\n" + airport2);
    
    // getting the values of the properties of airport2 object using getter methods and printing them
    System.out.println(airport2.getAirportID());
    System.out.println(airport2.getCity());
    System.out.println(airport2.getCountry());
    
}
    
}
