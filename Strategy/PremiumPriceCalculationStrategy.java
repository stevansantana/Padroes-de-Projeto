class PremiumPriceCalculationStrategy implements PriceCalculationStrategy {

    public double calculatePrice(double price) {
        return price * 0.9;
    }
}