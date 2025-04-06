import java.util.*;

class Event {
    String name;
    int totalTickets;
    double price;

    public Event(String name, int totalTickets, double price) {
        this.name = name;
        this.totalTickets = totalTickets;
        this.price = price;
    }

    // Thread-safe booking
    public synchronized boolean bookTickets(int count) {
        if (totalTickets >= count) {
            totalTickets -= count;
            return true;
        } else {
            return false;
        }
    }

    public void displayDetails() {
        System.out.println("Event: " + name);
        System.out.println("Tickets Available: " + totalTickets);
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------------");
    }
}

public class TicketBookingSystem {
    static List<Event> events = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Adding some events
        events.add(new Event("Rock Concert", 50, 299.99));
        events.add(new Event("Stand-up Comedy", 30, 199.99));
        events.add(new Event("Tech Conference", 100, 399.99));

        System.out.println("🎫 Welcome to the Event Ticket Booking System!");
        while (true) {
            displayEvents();
            System.out.print("Enter the event number to view/book (-1 to exit): ");
            int choice = scanner.nextInt();

            if (choice == -1) {
                System.out.println("Thank you for using the system. Goodbye!");
                break;
            }

            if (choice > events.size()) {
                System.out.println("❌ Invalid choice. Try again.");
                continue;
            }

            Event selectedEvent = events.get(choice);
            selectedEvent.displayDetails();

            System.out.print("Enter number of tickets to book: ");
            int ticketCount = scanner.nextInt();

            boolean success = selectedEvent.bookTickets(ticketCount);
            if (success) {
                System.out.println("✅ Booking successful for " + ticketCount + " ticket(s) to " + selectedEvent.name);
                System.out.println("🧾 Confirmation sent. Enjoy the event!\n");
            } else {
                System.out.println("❌ Not enough tickets available!\n");
            }
        }
    }

    static void displayEvents() {
        System.out.println("\n📅 Available Events:");
        for (int i = 0; i < events.size(); i++) {
            Event e = events.get(i);
            System.out.println((i) + ". " + e.name + " | Tickets Left: " + e.totalTickets + " | ₹" + e.price);
        }
        System.out.println();
    }
}
