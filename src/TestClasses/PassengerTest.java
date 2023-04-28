package TestClasses;  //create a package named "TestClasses"

//import the necessary classes
import Classes.Address;
import Classes.Name;
import Classes.Passenger;

//create a public class named "PassengerTest"
public class PassengerTest {
   //create the main method
public static void main(String[] args) {
    
    //create an instance of Passenger using constructor 01
    Passenger passenger1 = new Passenger();
    
    //create instances of Name and Address
    Name name1 = new Name("Madhushi","Welikala");
    Address address1 = new Address("Madulawa", "Padukka");
    
    //set the values of name, address, and telephone number using the setters
    passenger1.setName(name1);
    passenger1.setAddress(address1);
    passenger1.setTelephoneNumber("011 283 1716");
    
    //print the passenger details
    System.out.println(passenger1);
    
    //create another set of Name and Address
    Name name2 = new Name("Sajini","Senaratna");
    Address address2 = new Address("HighLevel Rd.", "Godagama");
    
    //create an instance of Passenger using constructor 02
    Passenger passenger2 = new Passenger(name2, address2, "071 683 6774");
    
    //print the passenger details
    System.out.println(passenger2);
    
    //print the values of name, address, and telephone number using the getters
    System.out.println(passenger2.getName());
    System.out.println(passenger2.getAddress());
    System.out.println(passenger2.getTelephoneNumber());
}   
 
}
