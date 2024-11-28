public class Main {
    public static void main(String[] args) {
        Stand stand = new Stand();
        Book book = new Book(stand, 30, "Premium Ticket");
        Book book1 = new Book(stand, 10, "Premium Ticket");

        book.start();
        book1.start();
    }
}