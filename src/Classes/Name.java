package Classes;
// This code defines a class called "Name" in the "Classes" package, which represents a person's first and last name.
public class Name {
    private String firstName;// Declares a private instance variable called "firstName" of type String.
    private String lastName;// Declares a private instance variable called "lastName" of type String.

 public Name() { // Default constructor.
}

public Name(String firstName, String lastName) { // Constructor with two parameters.
    this.firstName = firstName; // Assigns the "firstName" parameter to the instance variable "firstName".
    this.lastName = lastName; // Assigns the "lastName" parameter to the instance variable "lastName".
}

public void setFirstName(String firstName) { // Method to set the value of the "firstName" instance variable.
    this.firstName = firstName; // Assigns the parameter to the instance variable "firstName".
}

public void setLastName(String lastName) { // Method to set the value of the "lastName" instance variable.
    this.lastName = lastName; // Assigns the parameter to the instance variable "lastName".
}

public String getFirstName() { // Method to retrieve the value of the "firstName" instance variable.
    return firstName; // Returns the value of "firstName".
}

public String getLastName() { // Method to retrieve the value of the "lastName" instance variable.
    return lastName; // Returns the value of "lastName".
}

@Override // Indicates that this method overrides a method from the superclass.
public String toString() { // Method to return a String representation of the object.
    return firstName + "@" + lastName; // Concatenates the "firstName" and "lastName" instance variables with "@" separator and returns it as a String.
}   

}
