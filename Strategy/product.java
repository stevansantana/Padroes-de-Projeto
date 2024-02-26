class Product {
    
    private String name;
    private double price;
    private PriceCalculationStrategy priceCalculationStrategy;

    public Product(String name, double price, PriceCalculationStrategy priceCalculationStrategy) {
        this.name = name;
        this.price = price;
        this.priceCalculationStrategy = priceCalculationStrategy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice() {
        return priceCalculationStrategy.calculatePrice(price);
    }
}