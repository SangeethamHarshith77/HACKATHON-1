import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    // Parameterized constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculate total amount
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculate discount
    double calculateDiscount() {
        double total = calculateTotal();

        if (numberOfTickets >= 5) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    // Calculate final amount
    double calculateFinalAmount() {
        double total = calculateTotal();
        double discount = calculateDiscount();

        return total - discount;
    }

    // Display booking bill
    void displayBill() {
        System.out.println("\n----- CINEMA TICKET BILL -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.printf("Ticket Price    : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount        : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount    : %.2f%n", calculateFinalAmount());
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        // Create object using parameterized constructor
        MovieTicket ticket = new MovieTicket(
            movieName,
            ticketPrice,
            numberOfTickets
        );

        // Display bill
        ticket.displayBill();

        sc.close();
    }
}
