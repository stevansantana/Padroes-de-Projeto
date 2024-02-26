class BookingStateConfirmed implements BookingState {

    private BookingSystem bookingSystem;
    private String selectedFlight;
    private int reservedSeat;

    public BookingStateConfirmed(BookingSystem bookingSystem, String selectedFlight, int reservedSeat) {
        this.bookingSystem = bookingSystem;
        this.selectedFlight = selectedFlight;
        this.reservedSeat = reservedSeat;
    }

    public void selectFlight(String flightCode) {
        System.out.println("Voo " + flightCode + " não disponível");
    }

    @Override
    public void reserveSeat(int seatNumber) {
        System.out.println("Reserva já confirmada para voo " + selectedFlight + " assento " + reservedSeat);
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reserva cancelada para voo " + selectedFlight + " assento " + reservedSeat);
        bookingSystem.setBookingState(bookingSystem.getBookingStateEmpty());
    }
}
