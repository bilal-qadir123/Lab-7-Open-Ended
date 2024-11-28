public class Stand extends Thread {
    int generalAdmissionTickets = 30;
    int premiumTickets = 70;
    int VIPTickets = 25;
    int tickets;

    public void generalAdmissionTickets(int tickets) {
        synchronized (Stand.class) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage()); 
            }
            if (tickets <= generalAdmissionTickets) {
                System.out.println(tickets + " for General Admission booked");
                generalAdmissionTickets -= tickets;
                System.out.println("Total General Admission tickets left: " + generalAdmissionTickets);
            } else {
                System.out.println("Not enough seats available");
                System.out.println("Total tickets left: " + generalAdmissionTickets);
            }
        }
    }

    public void bookPremiumTickets(int tickets) {
        synchronized (Stand.class) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if (tickets <= premiumTickets) {
                System.out.println(tickets + " for Premium Ticket booked");
                premiumTickets -= tickets;
                System.out.println("Total Premium tickets left: " + premiumTickets);
            } else {
                System.out.println("Not enough seats available");
                System.out.println("Total Premium tickets left: " + premiumTickets);
            }
        }
    }

    public void bookVIPTickets(int tickets) {
        synchronized (Stand.class) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if (tickets <= VIPTickets) {
                System.out.println(tickets + " for VIP Ticket booked");
                VIPTickets -= tickets;
                System.out.println("Total VIP tickets left: " + VIPTickets);
            } else {
                System.out.println("Not enough seats available");
                System.out.println("Total VIP tickets left: " + VIPTickets);
            }
        }
    }
} 