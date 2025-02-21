#  RailEase - Train Reservation System
**RailEase** is a simple and efficient train reservation system built using Java. It provides an easy-to-use console interface for booking, canceling, and managing train reservations.

##  Features

 **Book Train Tickets** (AC, First Class, Sleeper)  
 **Cancel Reservations** and receive refunds  
 **Search Passengers** by their booking number  
 **View Reservation Chart** with passenger details  
 **Check Available Tickets** for each class  
 **User-Friendly Console Interface**  

## Technologies Used

- **Java** (Core Java, OOP)
- **BufferedReader** (for user input)
- **Array Handling** (for passenger data storage)

## Installation & Setup

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-repo/railease.git
   cd railease
   ```
2. **Compile the Java Program**
   ```
   javac TrainReservation.java
   ```
3. **Run the Program**
   ```
   java TrainReservation
   ```

## Sample Output
```text 
============ Railway Reservation - RailEase ============

1. Book ticket
2. Cancel ticket
3. Search passenger
4. Reservation chart
5. Display unbooked tickets
6. Exit
Please enter your choice:
> 1

Please enter the class of ticket:
1. AC | 2. First Class | 3. Sleeper
> 2

Please enter no. of tickets:
> 2

Please enter your name:
> Harshini

Please enter your age:
> 23

Please enter your phone number:
> 9876543210

Available seats in First Class:
1 2 3 4 5 6 7 8 9 10 ... 125

Choose your seat number from available options:
> 5

Ticket successfully booked. Your seat number: 5


