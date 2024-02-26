public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Produto 1", 100.0, new StandardPriceCalculationStrategy());
        Product product2 = new Product("Produto 2", 100.0, new PremiumPriceCalculationStrategy());
        Product product3 = new Product("Produto 3", 100.0, new DiscountPriceCalculationStrategy());

        System.out.println(product1.getName() + " - Preço: $" + product1.getPrice() + " - Preço final: $" + product1.getFinalPrice());
        System.out.println(product2.getName() + " - Preço: $" + product2.getPrice() + " - Preço final: $" + product2.getFinalPrice());
        System.out.println(product3.getName() + " - Preço: $" + product3.getPrice() + " - Preço final: $" + product3.getFinalPrice());
    }
}