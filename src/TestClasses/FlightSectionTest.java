//declaring package TestClasses
package TestClasses;

import Classes.FlightSection; //importing FlightSection and SeatClass classes from Classes package
import Classes.SeatClass;

public class FlightSectionTest {  //defining class FlightSectionTest

//main method
public static void main(String[] args) {
    
   //testing constructor1
   FlightSection flightSection1 = new FlightSection();
    //System.out.println(flightSection1);
    
    //testing setters
    flightSection1.setSeatClass(SeatClass.ECONOMY);
    System.out.println(flightSection1);
    
    //testing constructor 02
   FlightSection flightSection2 = new FlightSection(SeatClass.ECONOMY);
    System.out.println(flightSection2);
   
   //testing getters
    System.out.println(flightSection2.getSeatClass());
}
    
}
