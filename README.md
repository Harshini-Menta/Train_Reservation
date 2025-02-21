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
===== Railway Reservation--RailEase =====
1. Book Ticket
2. Cancel Ticket
3. Search Passenger
4. View Reservation Chart
5. Display Available Tickets
6. Exit
Enter your choice: 1

--- Book Ticket ---
1. AC | 2. First Class | 3. Sleeper
Enter ticket class: 1
Enter number of tickets: 2
Enter Name: John Doe
Enter Age: 30
Enter Phone Number: 9876543210
Ticket booked successfully!
Total Amount: ₹3000
