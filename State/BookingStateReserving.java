class BookingStateReserving implements BookingState {

    private BookingSystem bookingSystem;
    private String selectedFlight;
    private int reservedSeat;

    public BookingStateReserving(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    public void selectFlight(String flightCode) {
        selectedFlight = flightCode;
        System.out.println("Voo " + flightCode + " selecionado");
    }

    public void reserveSeat(int seatNumber) {
        reservedSeat = seatNumber;
        System.out.println("Assento " + seatNumber + " reservado para voo " + selectedFlight);
        bookingSystem.setBookingState(bookingSystem.getBookingStateConfirmed());
    }

    public void cancelReservation() {
        System.out.println("Reserva cancelada");
        bookingSystem.setBookingState(bookingSystem.getBookingStateEmpty());
    }
}