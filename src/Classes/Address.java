package Classes;  // declares the package name

public class Address {  // defines a new class named "Address"

    private String street;  // declares a private string field named "street"
    private String city;  // declares a private string field named "city"

    public Address() {  // defines a constructor method with no arguments
    }    
    
    public Address(String street, String city) {  // defines a constructor method with two string arguments
        this.street = street;  // sets the value of the "street" field to the first argument passed
        this.city = city;  // sets the value of the "city" field to the second argument passed
    }   

    public void setStreet(String street) {  // defines a method to set the "street" field
        this.street = street;  // sets the value of the "street" field to the argument passed
    }    

    public void setCity(String city) {  // defines a method to set the "city" field
        this.city = city;  // sets the value of the "city" field to the argument passed
    }
    
    public String getStreet() {  // defines a method to get the value of the "street" field
        return street;  // returns the current value of the "street" field
    }
     
    public String getCity() {  // defines a method to get the value of the "city" field
        return city;  // returns the current value of the "city" field
    }

    @Override  // indicates that the following method overrides a superclass method
    public String toString() {  // defines a method to return a string representation of the object
        return street + "@" + city;  // returns the value of the "street" field concatenated with "@" and the value of the "city" field
    }
    
}
