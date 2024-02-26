class BookingStateEmpty implements BookingState {

    private BookingSystem bookingSystem;

    public BookingStateEmpty(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    public void selectFlight(String flightCode) {
        System.out.println("Voo " + flightCode + " não disponível");
    }

    public void reserveSeat(int seatNumber) {
        System.out.println("Nenhum voo selecionado");
    }

    public void cancelReservation() {
        System.out.println("Nenhuma reserva para cancelar");
    }
}