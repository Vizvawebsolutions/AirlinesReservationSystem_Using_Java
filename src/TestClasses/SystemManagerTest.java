// This code is a test class for the SystemManager class.
// It imports the SystemManager class and creates an instance of it with a file name parameter.
// It then calls the saveFlightInfo method on the instance of SystemManager.
// The other methods have been commented out and are not being called.
// These other methods include setFlightSeatDetails, getAirportDetails, getAirLineDetails, getFlightDetails, getSeatDetails, setFlights, and setSeat.

package TestClasses;

import Classes.SystemManager;

public class SystemManagerTest {

public static void main(String[] args) {
    // Create an instance of SystemManager with a file name parameter
    SystemManager test1 = new SystemManager("flightinfo.txt");

    // Call the saveFlightInfo method on the instance of SystemManager
    test1.saveFlightInfo();
    
    // The following methods have been commented out and are not being called
    // test1.setFlightSeatDetails();
    // test1.getAirportDetails();
    // test1.getAirLineDetails();
    // test1.getFlightDetails();
    // test1.getSeatDetails("QR 1675");
    // test1.setFlights();
    // test1.setSeat();
}

}
