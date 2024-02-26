public class Main {
    
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        bookingSystem.getBookingState().selectFlight("AA123");
        bookingSystem.getBookingState().reserveSeat(10);
        bookingSystem.getBookingState().cancelReservation();

        bookingSystem.getBookingState().reserveSeat(15);
        bookingSystem.getBookingState().selectFlight("BB456");
        bookingSystem.getBookingState().reserveSeat(20);
        bookingSystem.getBookingState().reserveSeat(25);
        bookingSystem.getBookingState().cancelReservation();
    }
}