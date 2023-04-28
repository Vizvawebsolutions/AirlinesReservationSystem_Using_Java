<h2 align="center">Airlines Reservation System</h2>
<p align="center">
 <img width="1000px" height="600px" src="https://github.com/Vizvawebsolutions/AirlinesReservationSystem_Using_Java/blob/master/images/airline%20snap1.PNG" align="center" alt="GitHub Readme" />
</p><br><br>
<p align="center">
 <img width="1000px" height="600px" src="https://github.com/Vizvawebsolutions/AirlinesReservationSystem_Using_Java/blob/master/images/airline%20snap2.PNG" align="center" alt="GitHub Readme" />
</p><br><br>
<p align="center">
 <img width="1000px" height="600px" src="https://github.com/Vizvawebsolutions/AirlinesReservationSystem_Using_Java/blob/master/images/airline%20snap3.PNG" align="center" alt="GitHub Readme" />
</p><br><br>
<p align="center">
 <img width="1000px" height="600px" src="https://github.com/Vizvawebsolutions/AirlinesReservationSystem_Using_Java/blob/master/images/airline%20snap4.PNG" align="center" alt="GitHub Readme" />
</p><br><br>
This is a GUI made using Java Swing.
It lets User perform multiple operations like:-


1- User can Create his Personal login for security purposes.

2- User can Add customers and Calculate their Electricity Bill.

3- User can Pay Electricity Bills.

4- User can Generate Bill.

## About Project:
This Java application was created using Intelli J .
Additional library was added for the support of JDBC (Required to setup the connection between the Database and Java Application).
It contains 9 different classes which works together to create a better user experience .

->Splash Screen class

->Login Screen class

->Main System class

->Add Customer class

->Pay Bill class

->Generate Bill class

->Show Details class

->Last Bill class

->Connection Setup class(JDBC - MySQL)

## Database (MySQL)
Database for this Electricity Billing System contains 4 Tables


->Login Table (UserName,Password)

->Bill Table(MeterNumber,Units,Month,Amount)

->Emp Table(Name, MeterNumber, Address, State, City, Email, Phone)

->Tax Table(MeterLocation,MeterType,PhaseCode,BillType,Days,MeterRent,MCB_Rent,ServiceRent,GST)


Java communicates with MySQL tables using JDBC which stands for Java Database Connectivity.
