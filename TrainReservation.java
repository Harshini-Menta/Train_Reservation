package TrainReservation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

class Passenger {
    int pno;
    String name;
    String phone;
    int age;
    int ticketClass;

    public Passenger(int pno, String name, String phone, int age, int ticketClass) {
        this.pno = pno;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.ticketClass = ticketClass;
    }
}

public class TrainReservation {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int pnum = 1;
    
    private int maxAC = 75;
    private int maxFirst = 125;
    private int maxSleeper = 175;

    public void doMenu() throws Exception {
        int choice;
        do {
            System.out.println("\n===== Railway Reservation =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Search Passenger");
            System.out.println("4. View Reservation Chart");
            System.out.println("5. Display Available Tickets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1 -> doBook();
                case 2 -> doCancel();
                case 3 -> doSearch();
                case 4 -> displayReservations();
                case 5 -> displayAvailableTickets();
                case 6 -> System.out.println("Exiting... Thank you for using our system!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private void doBook() throws Exception {
        System.out.println("\n--- Book Ticket ---");
        System.out.println("1. AC | 2. First Class | 3. Sleeper");
        System.out.print("Enter ticket class: ");
        int ticketClass = Integer.parseInt(br.readLine());

        System.out.print("Enter number of tickets: ");
        int numTickets = Integer.parseInt(br.readLine());

        if (!isAvailable(ticketClass, numTickets)) {
            System.out.println("Sorry, not enough tickets available.");
            return;
        }

        for (int i = 0; i < numTickets; i++) {
            System.out.print("Enter Name: ");
            String name = br.readLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter Phone Number: ");
            String phone = br.readLine();

            passengers.add(new Passenger(pnum++, name, phone, age, ticketClass));
            updateAvailability(ticketClass, -1);
            System.out.println("Ticket booked successfully!");
        }
        System.out.println("Total Amount: ₹" + numTickets * getPrice(ticketClass));
    }

    private void doCancel() throws Exception {
        System.out.print("\nEnter Passenger Number to cancel ticket: ");
        int pno = Integer.parseInt(br.readLine());

        Iterator<Passenger> iterator = passengers.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Passenger passenger = iterator.next();
            if (passenger.pno == pno) {
                updateAvailability(passenger.ticketClass, 1);
                iterator.remove();
                found = true;
                System.out.println("Ticket successfully canceled.");
                System.out.println("Refund Amount: ₹" + getRefund(passenger.ticketClass));
                break;
            }
        }

        if (!found) {
            System.out.println("Passenger not found.");
        }
    }

    private void doSearch() throws Exception {
        System.out.print("\nEnter Passenger Number to search: ");
        int pno = Integer.parseInt(br.readLine());

        for (Passenger passenger : passengers) {
            if (passenger.pno == pno) {
                System.out.println("\n--- Passenger Details ---");
                System.out.println("Passenger No: " + passenger.pno);
                System.out.println("Name: " + passenger.name);
                System.out.println("Age: " + passenger.age);
                System.out.println("Phone: " + passenger.phone);
                System.out.println("Class: " + getClassName(passenger.ticketClass));
                return;
            }
        }
        System.out.println("Passenger not found.");
    }

    private void displayReservations() {
        System.out.println("\n--- Reservation Chart ---");
        if (passengers.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        System.out.printf("%-10s %-15s %-10s %-15s %-10s\n", "P.No", "Name", "Age", "Phone", "Class");
        System.out.println("--------------------------------------------------------------");
        for (Passenger passenger : passengers) {
            System.out.printf("%-10d %-15s %-10d %-15s %-10s\n", 
                              passenger.pno, passenger.name, passenger.age, passenger.phone, getClassName(passenger.ticketClass));
        }
    }

    private void displayAvailableTickets() {
        System.out.println("\n--- Available Tickets ---");
        System.out.println("AC Class: " + maxAC);
        System.out.println("First Class: " + maxFirst);
        System.out.println("Sleeper Class: " + maxSleeper);
    }

    private boolean isAvailable(int ticketClass, int numTickets) {
        return switch (ticketClass) {
            case 1 -> maxAC >= numTickets;
            case 2 -> maxFirst >= numTickets;
            case 3 -> maxSleeper >= numTickets;
            default -> false;
        };
    }

    private void updateAvailability(int ticketClass, int change) {
        switch (ticketClass) {
            case 1 -> maxAC += change;
            case 2 -> maxFirst += change;
            case 3 -> maxSleeper += change;
        }
    }

    private int getPrice(int ticketClass) {
        return switch (ticketClass) {
            case 1 -> 1500;
            case 2 -> 1200;
            case 3 -> 1000;
            default -> 0;
        };
    }

    private int getRefund(int ticketClass) {
        return switch (ticketClass) {
            case 1 -> 1800;
            case 2 -> 1500;
            case 3 -> 1000;
            default -> 0;
        };
    }

    private String getClassName(int ticketClass) {
        return switch (ticketClass) {
            case 1 -> "AC";
            case 2 -> "First Class";
            case 3 -> "Sleeper";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) throws Exception {
        TrainReservation reservation = new TrainReservation();
        reservation.doMenu();
    }
}
