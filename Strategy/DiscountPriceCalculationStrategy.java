class DiscountPriceCalculationStrategy implements PriceCalculationStrategy {

    public double calculatePrice(double price) {
        return price * 0.8;
    }
}