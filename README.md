# Train Reservation System - RailEase

The **Train Reservation System - RailEase** is a simple console-based Java application that allows users to book, cancel, search for passengers, view reservations, and check ticket availability. This system helps in managing railway ticket reservations efficiently.

## Features
- **Book Ticket**: Users can book tickets for AC, First Class, or Sleeper.
- **Cancel Ticket**: Allows users to cancel their booked tickets and receive a refund.
- **Search Passenger**: Enables searching for a passenger's details using their Passenger Number.
- **View Reservation Chart**: Displays a list of all booked passengers.
- **Display Available Tickets**: Shows the number of tickets available for each class.
- **Exit**: Exits the system.

## Technologies Used
- **Java**
- **BufferedReader for Input Handling**
- **ArrayList for Data Storage**

## Installation & Setup
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/train-reservation.git
   ```
2. **Navigate to the Project Directory:**
   ```bash
   cd train-reservation
   ```
3. **Compile the Java Program:**
   ```bash
   javac TrainReservation.java
   ```
4. **Run the Program:**
   ```bash
   java TrainReservation
   ```

## How to Use
1. **Run the Program**
2. **Choose an Option from the Menu:**
   - Enter `1` to book a ticket.
   - Enter `2` to cancel a ticket.
   - Enter `3` to search for a passenger.
   - Enter `4` to view the reservation chart.
   - Enter `5` to check available tickets.
   - Enter `6` to exit.
3. **Follow the On-Screen Instructions**

## Ticket Pricing
| Ticket Class  | Price (₹) |
|--------------|----------|
| AC           | 1500     |
| First Class  | 1200     |
| Sleeper      | 1000     |

## Refund Policy
| Ticket Class  | Refund Amount (₹) |
|--------------|------------------|
| AC           | 1800             |
| First Class  | 1500             |
| Sleeper      | 1000             |

## Example Output
```
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
Enter Name: Harshini
Enter Age: 22
Enter Phone Number: 9876543210
Ticket booked successfully!
Total Amount: ₹3000
```


