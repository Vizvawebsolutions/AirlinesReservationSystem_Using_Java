// This code defines a class named Airport
package Classes;

// Defines the class Airport
public class Airport {

    // Declare three private string variables named airportID, city, and country
    private String airportID; // Three letters airport code
    private String city; // Name of the city where the airport is located
    private String country; // Name of the country where the airport is located
    
    //Constructor01: This constructor initializes the three variables with empty string
    public Airport() {
        this.airportID = "";
        this.city = "";
        this.country = "";
    }

    //Constructor02: This constructor initializes the three variables with provided values
    public Airport(String airportID, String city, String country) {
        // Uses setters to assign values to the variables
        this.setAirportID(airportID);
        this.setCity(city);
        this.setCountry(country);
    }

    // Method name: setAirportID
    // Purpose: To assign the airportID variable with an ID
    // Pre-condition: The airportID variable does not contain an ID
    // Post-condition: The airportID variable contains an ID
    public void setAirportID(String airportID) {   
        // The input must be a string of only letters and have a length of 3 to be a valid airport ID
        if(airportID.matches("[a-zA-Z]+$") && airportID.length()==3){
            this.airportID = airportID.toUpperCase();
        }
        else{
            System.out.println("Invalid Airport ID"); // If the input is not valid, it prints a message
        }   
    }

    // Method name: setCity
    // Purpose: To assign the city variable with a valid city name
    // Pre-condition: The city variable does not contain a valid city name
    // Post-condition: The city variable contains a valid city name
    public void setCity(String city) {
        // The input must be a string of only letters and spaces to be a valid city name
        if (city.matches("[a-zA-Z ]+$")) {
            this.city = city;
        }
        else{
            System.out.println("Invalid City Name"); // If the input is not valid, it prints a message
        }
    }

    // Method name: setCountry
    // Purpose: To assign the country variable with a valid country name
    // Pre-condition: The country variable does not contain a valid country name
    // Post-condition: The country variable contains a valid country name
    public void setCountry(String country) {
        // The input must be a string of only letters and spaces to be a valid country name
        if (country.matches("[a-zA-Z ]+$")) {
            this.country = country;
        }
        else{
            System.out.println("Invalid Airline Name"); // If the input is not valid, it prints a message
        }
    }

    // Method name: getAirportID
    // Purpose: To return the airportID in uppercase letters
    // Post-condition: The airportID is returned in uppercase letters
    public String getAirportID() {
        return airportID;
    }

    // Method name: getCity
    // Purpose: To return the city name
    // Post-condition: The city name is returned
    public String getCity() {
        return city;
    }

    // Method name: getCountry
    // Purpose: To return the country name
    // Post-condition: The country name is returned
    public String getCountry() {
        return country;
    }

    // Override the default toString method to return a formatted string
    @Override
    public String toString() {
        return this.getAirportID() + "," + this.getCity() + "," + this.getCountry();
    }
      
    
}
