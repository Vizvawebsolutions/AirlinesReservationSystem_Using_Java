package Classes;
// This code defines a class called "Passenger" in the "Classes" package
public class Passenger {
    // Private instance variables for name, address, and telephone number
    private Name name;
    private Address address;
    private String telephoneNumber;

 // Default constructor
public Passenger() {
    // Instantiate the "name" and "address" objects using their default constructors
    name = new Name();
    address = new Address();
    // Set telephone number to an empty string
    this.telephoneNumber = "";
}

// Parameterized constructor
public Passenger(Name name, Address address, String telephoneNumber) {
    // Set the "name", "address", and "telephoneNumber" instance variables to the values passed in
    this.name = name;
    this.address = address;
    this.telephoneNumber = telephoneNumber;
}

// Setter methods for name, address, and telephoneNumber instance variables
public void setName(Name name) {
    this.name = name;
}

public void setAddress(Address address) {
    this.address = address;
}

public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
}

// Getter methods for name, address, and telephoneNumber instance variables
public Name getName() {
    return name;
}

public Address getAddress() {
    return address;
}

public String getTelephoneNumber() {
    return telephoneNumber;
}

// Overrides the default toString() method to return a formatted string
@Override
public String toString() {
    return name + "@" + address + "@" + telephoneNumber;
}         
}
