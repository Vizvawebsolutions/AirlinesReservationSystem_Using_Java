package TestClasses;    // Declare a package named "TestClasses"
import Classes.Seat;    // Import the Seat class from the "Classes" package

public class SeatTest { // Define a public class named "SeatTest"

    public static void main(String[] args) {
       //test constructor01
     /*  Seat seat1 = new Seat();
        System.out.println(seat1);
        
        //test setters
        seat1.setSeatID("A05");
        seat1.setStatus(true);
        System.out.println(seat1);*/
        
        //test constructor02
        Seat seat2 = new Seat("C09", false);
        System.out.println("\n"+ seat2);
        
        //test getters
        System.out.println(seat2.getSeatID());
        System.out.println(seat2.isStatus());
    }
    
}
