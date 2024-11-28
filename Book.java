public class Book extends Thread {
    Stand stand;
    int ticketsToBook;
    String ticketType;

    public Book(Stand stand, int ticketsToBook, String ticketType) {
        this.stand = stand;
        this.ticketsToBook = ticketsToBook;
        this.ticketType = ticketType;
    }

    public void run() {
        if (ticketType.equals("General Admission")) {
            stand.generalAdmissionTickets(ticketsToBook);
        } else if (ticketType.equals("Premium Ticket")) {
            stand.bookPremiumTickets(ticketsToBook);
        } else if (ticketType.equals("VIP Ticket")) {
            stand.bookVIPTickets(ticketsToBook);
        } else {
            System.out.println("Select from: \nGeneral Admission \nPremium Ticket \nVIP Ticket");
        }
    }
}